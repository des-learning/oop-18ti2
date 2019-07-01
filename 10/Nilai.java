public class Nilai {
	private String nama;
	private double tugas;
	private double uts;
	private double uas;

	public Nilai(String nama, double tugas, double uts, double uas) {
		this.nama = nama;
		this.tugas = tugas;
		this.uts = uts;
		this.uas = uas;
	}

	public String getNama() { return nama; }
	public double getTugas() { return tugas; }
	public double getUTS() { return uts; }
	public double getUAS() { return uas; }

	public String toString() {
		return String.format("Nilai<%s %.2f %.2f %.2f>", nama, tugas, uts, uas);
	}
}
