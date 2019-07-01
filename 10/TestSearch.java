import java.util.List;
import java.util.Arrays;

public class TestSearch {
	public static void main(String []args) {
		Search<Integer> sint = new Search<Integer>((Integer x, Integer y) -> x - y);
		Search<Nilai> snilai = new Search<Nilai>((Nilai x, Nilai y) -> (int)(x.getTugas() - y.getTugas()));

		List<Integer> ints = Arrays.asList(new Integer[]{
			1,3,5,8,9,10,35,37,40,56,66,70,306
		});
		List<Nilai> nilais = Arrays.asList(new Nilai[]{
			new Nilai("budi", 20, 30, 60),
			new Nilai("agus", 50, 35, 70),
			new Nilai("rudi", 90, 55, 90),
		});

		System.out.println(sint.sequential(37, ints));
		System.out.println(sint.binary(10, ints));
		System.out.println(snilai.sequential(new Nilai("", 90, 0, 0), nilais));
		System.out.println(snilai.sequential(new Nilai("", 10, 0, 0), nilais));
		System.out.println(snilai.sequential(new Nilai("", 50, 0, 0), nilais));

		snilai.setComparator((Nilai x, Nilai y) -> (int)(x.getUTS() - y.getUTS()));
		System.out.println(snilai.binary(new Nilai("", 0, 55, 0), nilais));
	}
}
