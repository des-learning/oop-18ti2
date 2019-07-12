import java.time.LocalDate;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DateRange implements Iterable<LocalDate> {
	private LocalDate from, to;

	public DateRange(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}

	public Iterator<LocalDate> iterator() {
		return new DateRangeIterator(from, to);
	}

	public LocalDate fromDate() { return from; }
	public LocalDate toDate() { return to; }

	public boolean contains(LocalDate date) {
		return this.from.compareTo(date) <= 0 && this.to.compareTo(date) >= 0;
	}

	public boolean overlap(DateRange range) {
		return this.contains(range.fromDate()) || this.contains(range.toDate());
	}
}

class DateRangeIterator implements Iterator<LocalDate> {
	private LocalDate from, to, current;

	public DateRangeIterator(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
		this.current = this.from;
	}
	
	public boolean hasNext() {
		return this.current.plusDays(1).compareTo(this.to) <= 0;
	}

	public LocalDate next() {
		if (!hasNext()) throw new NoSuchElementException();
		LocalDate currentDate = LocalDate.of(this.current.getYear(),
				this.current.getMonthValue(), this.current.getDayOfMonth());
		this.current = this.current.plusDays(1);
		return currentDate;
	}
}
