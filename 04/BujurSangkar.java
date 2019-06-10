public class BujurSangkar extends PersegiPanjang {

    public BujurSangkar(double sisi) {
        super(sisi, sisi);
    }

    // tambah method baru
    public double getSisi() {
        return this.getPanjang(); // or return this.getLebar();
    }
}