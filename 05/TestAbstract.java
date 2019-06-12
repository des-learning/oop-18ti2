public class TestAbstract {
    public static void PrintLuasKeliling(Bangun2D bangun) {
        System.out.printf("Keliling: %.2f\n", bangun.getKeliling());
        System.out.printf("Luas: %.2f\n", bangun.getLuas());
    }
    public static void main(String []args) {
        //PrintLuasKeliling(new Bangun2D());
        PrintLuasKeliling(new Lingkaran(5.0));
        PrintLuasKeliling(new PersegiPanjang(5.0, 7.0));
    }
}