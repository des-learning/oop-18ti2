import java.util.Scanner;

public class TestNilai {
	public static void main(String []args) {
		Nilai nilaiBudi; // object

		nilaiBudi = new Nilai(); //instantiate object

		/* nilaiBudi.nama = "Budi";
		nilaiBudi.mataKuliah = "OOP";
		nilaiBudi.setTugas(80.3f);
		nilaiBudi.setUTS(70.5f);
		nilaiBudi.setUAS(80.0f);
        nilaiBudi.setKehadiran(100.0f); */
        
        // input data dari keyboard
        Scanner input = new Scanner(System.in); // buat scanner untuk membaca dari standard input

        System.out.print("Nama: "); nilaiBudi.nama = input.nextLine();
        System.out.print("Mata kuliah: "); nilaiBudi.mataKuliah = input.nextLine();
        System.out.print("Nilai Tugas: "); nilaiBudi.setTugas(input.nextFloat()); input.nextLine();
        System.out.print("Nilai UTS: "); nilaiBudi.setUTS(input.nextFloat()); input.nextLine();
        System.out.print("Nilai UAS: "); nilaiBudi.setUAS(input.nextFloat()); input.nextLine();
        System.out.print("Kehadiran: "); nilaiBudi.setKehadiran(input.nextFloat()); input.nextLine();

		System.out.printf("Nilai akhir %s: %.2f\n",
				nilaiBudi.nama,
				nilaiBudi.hitungNilaiAkhir());
	}
}