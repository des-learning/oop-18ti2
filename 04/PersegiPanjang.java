public class PersegiPanjang {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return this.panjang;
    }

    public double getLebar() {
        return this.lebar;
    }

    public double getLuas() {
        return this.panjang * this.lebar;
    }

    public double getKeliling() {
        return 2 * this.panjang + 2 * this.lebar;
    }
}