public class TestIntRange {
	public static void test(int[]expected, IntRange range) {
		int index = 0;
		for (int i : range) {
			if (i != expected[index]) {
				System.err.printf("Expect %d got %d\n", expected[index], i);
				System.exit(-1);
			}
			index++;
			if (index >= expected.length) {
				System.out.printf("Should only has %d items\n", expected.length);
				System.exit(-1);
			}
		}
		if (index+1 != expected.length) {
				System.out.printf("Return too early, should has %d items got %d items\n", expected.length, index+1);
				System.exit(-1);
		}
	}
	public static void main(String []args) {
		int []expected = new int[]{1,2,3,4,5,6,7,8,9};
		test(expected, new IntRange(1,10));

		expected = new int[]{1,3,5,7,9};
		test(expected, new IntRange(1,10,2));

		expected = new int[]{10,9,8,7,6,5,4,3,2};
		test(expected, new IntRange(10,1,-1));

		expected = new int[]{10,8,6,4,2};
		test(expected, new IntRange(10,1,-2));

		for (int i : new IntRange(10, 5,-1)) {};
		for (int i : new IntRange(10, 5)) {};
		for (int i : new IntRange(10, 5, 1)) {};
	}
}
