import java.nio.file.Files;
import java.io.File;
import java.util.stream.Stream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class TextLength {
	private String text;
	private int length;

	public TextLength(String text, int length) {
		this.text = text;
		this.length = length;
	}
	public String getText() { return text; }
	public int getLength() { return length; }
}

public class BacaFileText {
	public static void main(String []args) {
		try {
			Stream<String> baris = Files.lines(new File("variadic.java").toPath());
			// for (String s: baris) { S.o.pln(s); }
			/*baris.forEach((String s) -> {
				System.out.println(s.toUpperCase());
			});*/
			/*List<String> processed = new ArrayList<String>();
			baris.map((String s) -> {
				return new TextLength(s, s.length());
			}).map((TextLength tl) -> {
				return String.format("%s: %d", tl.getText(), tl.getLength());
			}).forEach((String l) -> {
				//System.out.println(l);
				processed.add(l);
			});*/
			List<String> allBaris = baris.collect(Collectors.toList());
			long totalChar = 0;
			long totalBaris = allBaris.size();
			long totalKata = 0;
			for (String s: allBaris) {
				totalChar += s.length();
				totalKata += s.split(" ").length;
			}
			System.out.printf("Total Character: %d\n", totalChar);
			System.out.printf("Total Baris: %d\n", totalBaris);
			System.out.printf("Total Kata: %d\n", totalKata);
		} catch (IOException e) {
			System.err.println("I/O exception occured when reading file");
		} catch (SecurityException e) {
			System.err.println("Security exception occured when reading file");
		}
	}
}
