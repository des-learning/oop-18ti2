import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.EOFException;
import java.util.List;
import java.util.Arrays;

class Manusia {
	public String nama;
	public int umur;
	public double tinggi;
	public boolean jenisKelamin;
	public Manusia(String nama, int umur, double tinggi, boolean jenisKelamin) {
		this.nama = nama;
		this.umur = umur;
		this.tinggi = tinggi;
		this.jenisKelamin = jenisKelamin;
	}

}

public class TulisBacaBinary {
	public static void write(RandomAccessFile raf, Manusia m) throws IOException {
		raf.writeUTF(m.nama);
		raf.writeInt(m.umur);
		raf.writeDouble(m.tinggi);
		raf.writeBoolean(m.jenisKelamin);
	}

	public static Manusia read(RandomAccessFile raf) throws IOException, EOFException {
		String nama = raf.readUTF();
		int umur = raf.readInt();
		double tinggi = raf.readDouble();
		boolean jk = raf.readBoolean();

		return new Manusia(nama, umur, tinggi, jk);
	}

	public static Manusia readRec(RandomAccessFile raf, int record, int recsize) throws IOException, EOFException {
		raf.seek((record-1) * recsize);
		return read(raf);
	}

	public static void main(String []args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("manusia.bin", "rw");
		List<Manusia> m = Arrays.asList(new Manusia[]{
			new Manusia("budi", 30, 170.2, true),
			new Manusia("susi", 20, 180.5, false),
			new Manusia("andi", 20, 180.5, false),
			new Manusia("rudi", 20, 180.5, false),
			new Manusia("agus", 20, 180.5, false)
		});

		for (Manusia i: m) {
			write(raf, i);
		}

		// pindahkan pointer ke awal file
		raf.seek(0);

		while (true) {
			try {
				Manusia i = read(raf);
				display(i);
			} catch (EOFException e) {
				break;
			}
		}

		int recsize = 19;

		display(readRec(raf, 3, recsize));

		raf.close();
	}

	public static void display(Manusia m) {
		System.out.printf("nama: %s\n", m.nama);
		System.out.printf("umur: %d\n", m.umur);
		System.out.printf("tinggi: %f\n", m.tinggi);
		System.out.printf("jenis kelamin: %b\n", m.jenisKelamin);
	}
}
