import java.util.Random;
import java.util.Scanner;

public class TebakNilai {
    protected int batasBawah;
    protected int batasAtas;
    protected int nilai;
    protected int percobaan;
    protected Boolean result;

	public TebakNilai(int batasBawah, int batasAtas, int percobaan) {
        this.batasBawah = batasBawah;
        this.batasAtas = batasAtas;
		Random r = new Random();
        this.nilai = r.nextInt(batasAtas) + batasBawah;
        this.percobaan = percobaan;
        this.result = null;
    }
    
    public void play(Scanner input) {
        System.out.println("Nilai " + this.nilai);
        for (int i = 0; i < this.percobaan; i++) {
            System.out.printf("Tebakan %d-%d (tinggal %d tebakan): ",
                batasBawah, batasAtas, percobaan-i);
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

    /**
     * mengembalikan hasil permainan.
     * hasil permainan berupa string, yang menyatakan apakah pemain menang atau kalah.
     * jika game belum selesai, hasilnya adalah "game sedang berlangsung".
     * 
     * contoh: String hasil = game.getResult();
     */
    public String getResult() {
        String r = "game sedang berlangsung";
        if (this.result == true) {
            r = "Anda menang";
        } else if (this.result == false) {
            r = "Anda kalah";
        }
        return r;
    }

	// tebak menebak nilai
	// jika nilai tebakan sama dengan nilai kembalikan 0
	// jika nilai tebakan lebih besar dari nilai kembalikan positif
	// jika nilai tebakan lebih kecil dari nilai kembalikan negatif 
	protected int tebak(int tebakan) {
		return tebakan - this.nilai;
	}
}
