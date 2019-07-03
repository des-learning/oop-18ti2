public class variadic {
	public static int sum(int[] angka) {
		int total = 0;
		for (int n: angka) {
			total += n;
		}
		return total;
	}

	public static int sum1(int... angka) {
		int total = 0;
		for (int n: angka) {
			total += n;
		}
		return total;
	}

	public static void main(String []args) {
		for (int i = 0; i < args.length; i++) {
			System.out.printf("parameter-%d: %s\n", i, args[i]);
		}

		int []s = new int[]{1,2,3};
		System.out.println(sum(new int[]{1,2,3}));
		System.out.println(sum(s));

		System.out.println(sum1(1,2,3));
		System.out.println(sum1(4,5));
		System.out.println(sum1(s));
	}
}
