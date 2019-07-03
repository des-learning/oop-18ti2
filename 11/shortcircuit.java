public class shortcircuit {
	public static boolean benar(String s) {
		System.out.println(s);
		return true;
	}

	public static boolean salah(String s) {
		System.out.println(s);
		return false;
	}
	public static void main(String []args) {
		boolean a = benar("expr1") && benar("expr2");
		boolean b = benar("expr3") && salah("expr4");
		boolean c = salah("expr5") && benar("expr6");
		boolean d = salah("expr7") && salah("expr8");

		boolean e = benar("expr8") || benar("expr9");
		boolean f = benar("expr10") || salah("expr11");
		boolean g = salah("expr12") || benar("expr13");
		boolean h = salah("expr14") || salah("expr15");

		boolean i = benar("expr16") && (salah("expr17") || benar("expr18"));
		System.out.println(i);
		System.out.println(1 & 10);
	}
}
