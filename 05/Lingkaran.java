// concrete class
public class Lingkaran extends Bangun2D {
    private double r;
    
    public Lingkaran(double r) {
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    public double getDiameter() {
        return 2.0 * this.r;
    }

    public double getKeliling() {
        return 2.0 * Math.PI * this.r;
    }
    
    public double getLuas() {
        return Math.PI * (this.r * this.r);
    }
}