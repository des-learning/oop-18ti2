import java.nio.file.Files;
import java.io.File;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.util.Arrays;

public class TulisFileText {
	public static void main(String []args) {
		String[] lines = new String[]{
			"xxxxxx",
			"Bye world",
			"Morning",
			"Evening",
			"yyyyy"
		};

		try {
			Files.write(new File("hello.txt").toPath(),
				Arrays.asList(lines),
				StandardOpenOption.CREATE,
				StandardOpenOption.WRITE
				);
		} catch (IOException e) {
			System.err.println("I/O exception when writing to file");
		}
	}
}
