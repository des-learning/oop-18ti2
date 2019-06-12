public class TestValueRef {
	public static void byValue(int n) {
		n = n + 1;
		System.out.printf("N di dalam function: %d\n", n);
	}

	public static void byRef(Manusia m) {
		m.nama = "Susi";
		System.out.printf("Nama di dalam function: %s\n", m.nama);
	}

	public static void changeString(String s) {
		s = s + " coba";
		System.out.printf("S di dalam function: %s\n", s);
	}

	public static void main(String []args) throws CloneNotSupportedException {
		int a = 10;
		System.out.printf("a: %d\n", a);
		byValue(a);
		System.out.printf("a: %d\n", a);

		Manusia b = new Manusia("Budi");
		System.out.printf("nama: %s\n", b.nama);
		byRef((Manusia)b.clone());
		//byRef(b);
		System.out.printf("nama: %s\n", b.nama);

		String s = "testing";
		System.out.printf("s: %s\n", s);
		changeString(s);
		System.out.printf("s: %s\n", s);
	}
}

class Manusia implements Cloneable {
	public String nama;
	public Manusia(String nama) {
		this.nama = nama;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
