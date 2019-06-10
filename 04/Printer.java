import java.util.Arrays;
import java.util.List;
import java.lang.reflect.Method;
import java.util.Optional;

public class Printer {
    // method overloading
    public static void print(PersegiPanjang p) {
        System.out.println("Persegi panjang");
        System.out.printf("Panjang: %.2f\n", p.getPanjang());
        System.out.printf("Lebar: %.2f\n", p.getLebar());
        System.out.printf("Keliling: %.2f\n", p.getKeliling());
        System.out.printf("Luas: %.2f\n", p.getLuas());
    }

    // method overloading
    public static void print(BujurSangkar b) {
        System.out.println("Bujur sangkar");
        System.out.printf("Sisi: %.2f\n", b.getSisi());
        System.out.printf("Keliling: %.2f\n", b.getKeliling());
        System.out.printf("Luas: %.2f\n", b.getLuas());
    }

    public static void print(Object o) {
        System.out.printf("Cannot print: %s\n", o.getClass().getName());
        if (o instanceof Srigala) {
            System.out.println(((Srigala) o).bersuara());
        }
    }
}