import java.io.File;

public class FileText {
	public static void main(String []args) {
		File f = new File("FileText.java");

		System.out.printf("file exists: %b\n", f.exists());
		System.out.printf("is file: %b\n", f.isFile());
		System.out.printf("is directory: %b\n", f.isDirectory());
		System.out.printf("absolute path: %s\n", f.getAbsolutePath());
	}
}
