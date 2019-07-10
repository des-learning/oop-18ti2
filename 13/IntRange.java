import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntRange implements Iterable<Integer> {
	private int from, to, step;
	public IntRange(int from, int to) {
		this(from, to, 1);
	}

	public IntRange(int from, int to, int step) {
		checkParameter(from, to, step);
		this.from = from;
		this.to = to;
		this.step = step;
	}

	public Iterator<Integer> iterator() {
		return new IntRangeIterator(from, to, step);
	}

	private void checkParameter(int from, int to, int step) {
		if (step == 0)
			throw new IllegalArgumentException("step tidak boleh 0");
		if (step > 0 && from > to)
			throw new IllegalArgumentException("from tidak boleh besar dari to");
		if (step < 0 && from < to)
			throw new IllegalArgumentException("from tidak boleh lebih kecil dari to");
	}
}

class IntRangeIterator implements Iterator<Integer> {
	private int from, to, step;
	private int current;

	public IntRangeIterator(int from, int to, int step) {
		this.from = from;
		this.to = to;
		this.step = step;
		this.current = this.from;
	}

	public boolean hasNext() {
		if (this.step > 0)
			return this.current + this.step < this.to;
		else
			return this.current + this.step > this.to;
	}

	public Integer next() {
		if (!hasNext()) throw new NoSuchElementException();
		int current = this.current;
		this.current += this.step;
		return current;
	}
}
