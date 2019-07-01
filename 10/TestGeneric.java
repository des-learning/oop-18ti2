public class TestGeneric {
	// generic method
	public static <T> void swap(T t1, T t2) {
		T temp = t1;
		t1 = t2;
		t2 = temp;
	}
	public static void main(String []args) {
		swap(10, 5);
		swap("abc", "def");

		Swapper<Object> s = new Swapper<Object>();
		s.swap(10, 5); // compile success karena 10 dan 5 adalah integer
		s.swap("abc", "def"); // compile error karena "abc" dan "def" bukan integer
	}
}
// Generic class
class Swapper <T> {
	public void swap(T t1, T t2) {
		T temp = t1;
		t1 = t2;
		t2 = temp;
	}
}

// Generic interface
interface Printable <T> {
	public void print(T t);
}
