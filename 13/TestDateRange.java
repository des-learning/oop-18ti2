import java.time.LocalDate;

public class TestDateRange {
	public static void main(String []args) {
		DateRange date = new DateRange(LocalDate.of(2019, 7, 10),
									   LocalDate.of(2019, 7, 20));
		LocalDate[]dates = new LocalDate[]{
			LocalDate.of(2019, 7, 10),
			LocalDate.of(2019, 7, 11),
			LocalDate.of(2019, 7, 12),
			LocalDate.of(2019, 7, 13),
			LocalDate.of(2019, 7, 14),
			LocalDate.of(2019, 7, 15),
			LocalDate.of(2019, 7, 16),
			LocalDate.of(2019, 7, 17),
			LocalDate.of(2019, 7, 18),
			LocalDate.of(2019, 7, 19),
			LocalDate.of(2019, 7, 20),
		};
		int index = 0;
		for (LocalDate d: range) {
			if (! d.equals(dates[index])) {
				System.out.printf("should be %s got %s\n", dates[index], d);
				break;
			}
			index++;
			if (index >= dates.length) {
				System.out.printf("should only has %d day(s)\n", dates.length);
				break;
			}
		}
	}
}
