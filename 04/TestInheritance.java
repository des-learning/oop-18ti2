public class TestInheritance {
    public static void main(String []args) {
        PersegiPanjang p = new PersegiPanjang(10, 7);
        BujurSangkar b = new BujurSangkar(5);

        System.out.printf("Persegi Panjang(P: %f, L: %f) -> Luas: %f, Keliling: %f\n",
            p.getPanjang(), p.getLebar(), p.getLuas(), p.getKeliling());
        System.out.printf("Bujur Sangkar(S: %f) -> Luas: %f, Keliling: %f\n",
            b.getSisi(), b.getLuas(), b.getKeliling());

        Srigala s = new Srigala();
        Anjing a = new Anjing();

        System.out.println(s.bersuara());
        System.out.println(a.bersuara());

        Printer.print(p);
        Printer.print(b);
        Printer.print(s);
        Printer.print(a);
        Printer.print(new Ikan());
    }
}