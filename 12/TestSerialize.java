import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

class Manusia implements Serializable {
	final long serialVersionUID = 1L;

	private String nama;
	private int umur;

	public Manusia(String nama, int umur) {
		this.nama = nama;
		this.umur = umur;
	}

	public String getNama() { return nama; }
	public int getUmur() { return umur; }
}
public class TestSerialize {
	public static void main(String []args) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(
			new FileOutputStream("serialize.bin"));

		Manusia m = new Manusia("budi", 20);
		oos.writeObject(m);

		oos.close();
	}
}
