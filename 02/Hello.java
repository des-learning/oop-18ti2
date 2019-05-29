public class Hello {
    public static void main(String []args) {
        System.out.println("Hello World");

        Manusia budi, susi;
        budi = new Manusia("budi");
        susi = new Manusia();
        susi.setNama("susi");

        budi.menyapa(susi);
        susi.menyapa(budi);

        budi.setNama("andi");

        System.out.printf("%s %s\n", budi.getNama(), susi.getNama());
    }
}
