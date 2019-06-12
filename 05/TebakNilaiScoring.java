import java.util.Scanner;

public class TebakNilaiScoring extends TebakNilai {
    private int jumlahTebakan;
    public TebakNilaiScoring(int batasBawah, int batasAtas, int percobaan) {
        super(batasBawah, batasAtas, percobaan);
        this.jumlahTebakan = 0;
    }

    // override play yang ada di TebakNilai
    public void play(Scanner input) {
        for (this.jumlahTebakan = 0;  this.jumlahTebakan < this.percobaan; this.jumlahTebakan++) {
            System.out.printf("Tebakan %d-%d (tinggal %d tebakan): ",
                batasBawah, batasAtas, percobaan-jumlahTebakan);
            int hasil = tebak(Integer.parseInt(input.nextLine()));
            if (hasil == 0) {
                this.result = true;
                return;
            } else if (hasil < 0) {
                System.out.println("Tebakan terlalu kecil");
            } else {
                System.out.println("Tebakan terlalu besar");
            }
        }
        this.result = false;
    }

    public double getScore() {
        // belum play
        if (this.result == null)
            return 0.0;

        double nilai = ((double)this.percobaan - (double)this.jumlahTebakan) / (double)this.percobaan * 100.0;
        return nilai;
    }
}