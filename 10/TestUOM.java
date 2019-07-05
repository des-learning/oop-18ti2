import java.util.List;
import java.util.Arrays;

public class TestUOM {
	public static void display(List<UOM> uoms) {
		for (UOM uom: uoms) {
			System.out.println(uom);
		}
	}

	public static void main(String []args) {
		List<UOM> uoms = Arrays.asList(new UOM[]{
			new UOM("m", 100, 1),
			new UOM("cm", 100, 100),
			new UOM("km", 100, 0.001),
			new UOM("mm", 100, 1000),
			new UOM("dm", 100, 0.01)
		});

		display(uoms);
		uoms.sort((UOM a, UOM b) -> {
			double n1 = (a.getUnit().doubleValue() / a.getRate().doubleValue());
			double n2 = (b.getUnit().doubleValue() / b.getRate().doubleValue());
			double compare = n1-n2;
			if (compare < 0.0) return -1;
			if (compare > 0.0) return 1;
			return 0;
		});
		System.out.println("sorted");
		display(uoms);
	}
}
