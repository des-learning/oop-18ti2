public class TestPolymorphism {
    public static void main(String []args) {
        // supercasting
        Object[] o = new Object[]{
            new Srigala(),
            new Ikan(),
            new Anjing(),
            new Anjing(),
            new BujurSangkar(10.0),
            new PersegiPanjang(5.0, 2.0),
            new BujurSangkar(7.0)
        };
        Srigala[] s = new Srigala[]{
            new Srigala(),
            new Anjing(),
            new Srigala()
        };

        // subcasting
        for (Object i: o) {
            System.out.println(i.getClass().getName());
            if (i instanceof Srigala) {
                System.out.println(((Srigala) i).bersuara());
            } else if (i instanceof Ikan) {
                System.out.println(((Ikan) i).bersuara());
            } else if (i instanceof PersegiPanjang) {
                PersegiPanjang p = (PersegiPanjang) i;
                System.out.printf("Keliling: %.2f\n", p.getKeliling());
                System.out.printf("Luas: %.2f\n", p.getLuas());
            }
            System.out.println("====");
        }
    }
}