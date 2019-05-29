public class Manusia {
    private String nama;

    // default constructor
    public Manusia() {
        this.setNama("");
    }

    // constructor
    public Manusia(String nama) {
        this.setNama(nama);
    }

    // setter/mutator method
    public void setNama(String nama) {
        if (nama.equals("")) {
            this.nama = "OTK";
        } else {
            this.nama = nama;
        }
    }
    
    // getter/aksesor method
    public String getNama() {
        return this.nama;
    }

    public void menyapa(Manusia orang) {
        System.out.printf("%s: Hello, %s!\n", this.nama, orang.nama);
    }
}
