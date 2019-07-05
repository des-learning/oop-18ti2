import java.io.RandomAccessFile;
import java.io.IOException;


public class TulisFileBinary {
	public static void main(String []args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("output.bin", "rw");
		int []nilai = new int[]{10, 20, 30, 40, 50, 60, 65, 97};

		for (int n: nilai) {
			raf.write(n);
		}
		raf.close();
	}
}
