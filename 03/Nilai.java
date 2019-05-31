/**
 * class Nilai digunakan untuk menampung data nilai mahasiswa, berupa
 * nilai tugas, kehadiran, uts dan uas.
 * kemudian object Nilai dapat digunakan untuk menghitung nilai akhir berdasarkan
 * nilai tugas, kehadiran, uts dan uas.
 */
public class Nilai {
	// property/atribut
	String nama;
	String mataKuliah;
	private float tugas;
	private float kehadiran;
	private float uts;
    private float uas;
    
    // aksesor
    public float getTugas() {
        return this.tugas;
    }

    public float getKehadiran() {
        return this.kehadiran;
    }

    public float getUTS() {
        return this.uts;
    }

    public float getUAS() {
        return this.uas;
    }

    // check apakah nilai yang diinput valid, nilai yang valid harus berada diantara
    // batasBawah sampai dengan batasAtas
    // jika nilai yang diinput salah (diluar batas bawah dan atas) kembalikan false
    // jika nilai yang diinput benar (diantara batas bawah dan atas) kembalikan true
    private boolean isNilaiValid(float nilai, float batasBawah, float batasAtas) {
        if (nilai < batasBawah || nilai > batasAtas) {
            return false;
        }
        return true;
    }

    // menvalidasi nilai yang diinput
    // jika nilai yang diinput tidak valid (lihat isNilaiValid), tampilkan RuntimeException
    private void validateNilai(float nilai) {
        Float bawah = 0.0f;
        Float atas = 10.0f;
        String pesan = "Nilai harus antara " + bawah.toString() + " - " + atas.toString();
        if (!this.isNilaiValid(nilai, bawah, atas)) {
            throw new RuntimeException(pesan);
        }
    }

    // mutator
    // ubah nilai tugas kalau nilai yang iinput valid, jika tidak tampilkan RuntimeException
    public void setTugas(float tugas) {
        this.validateNilai(tugas);
        this.tugas = tugas;
    }

    public void setKehadiran(float kehadiran) {
        this.validateNilai(kehadiran);
        this.kehadiran = kehadiran;
    }

    public void setUTS(float uts) {
        this.validateNilai(uts);
        this.uts = uts;
    }

    public void setUAS(float uas) {
        this.validateNilai(uas);
        this.uas = uas;
    }

	// method
	float hitungNilaiAkhir() {
		return 0.3f * tugas + 0.1f * kehadiran +
			   0.3f * uts + 0.3f * uas;
	}
}