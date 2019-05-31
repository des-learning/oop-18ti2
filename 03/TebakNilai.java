import java.util.Random;

public class TebakNilai {
	private int nilai;

	public TebakNilai(int batasBawah, int batasAtas) {
		Random r = new Random();
		this.nilai = r.nextInt(batasAtas) + batasBawah;
	}

	// tebak menebak nilai
	// jika nilai tebakan sama dengan nilai kembalikan 0
	// jika nilai tebakan lebih besar dari nilai kembalikan positif
	// jika nilai tebakan lebih kecil dari nilai kembalikan negatif 
	public int tebak(int tebakan) {
		return tebakan - this.nilai;
	}
}
