import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.EOFException;

public class BacaFileBinary {
	public static void main(String []args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("output.bin", "r");
		int data;
		
		while (true) {
			System.out.printf("Current pos: %d\n", raf.getFilePointer());
			data = raf.read();
			if (data == -1) { break; }
			System.out.println(data);
		}
		raf.close();
	}
}
