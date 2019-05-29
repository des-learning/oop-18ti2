public class TestNilai {
	public static void main(String []args) {
		Nilai nilaiBudi; // object

		nilaiBudi = new Nilai(); //instantiate object

		nilaiBudi.nama = "Budi";
		nilaiBudi.mataKuliah = "OOP";
		nilaiBudi.tugas = 80.3f;
		nilaiBudi.uts = 70.5f;
		nilaiBudi.uas = 80.0f;
		nilaiBudi.kehadiran = 100.0f;

		System.out.printf("Nilai akhir %s: %.2f\n",
				nilaiBudi.nama,
				nilaiBudi.hitungNilaiAkhir());
	}
}