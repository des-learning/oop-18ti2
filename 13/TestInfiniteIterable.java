public class TestInfiniteIterable {
	public static void main(String []args) {
		for (String i: new InfiniteIterable<String>("hello")) {
			System.out.println(i);
		}
	}
}
