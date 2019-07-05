import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class TextUpper {
	public static List<String> allLinesToUpperCase(Stream<String> sl) {
		return sl.map((String l) -> {
			return l.toUpperCase();
		}).collect(Collectors.toList());
		/*
		 * List<String> hasil = new ArrayList<String>();
		 * for (String s: sl) {
		 * 	hasil.add(s.toUpperCase());
		 * }
		 */
	}
	public static void convertToUpperCase(
			String infile,
			String outfile) throws IOException,
		   						   SecurityException,
								   Exception {
			Stream<String> inlines = Files.lines((new File(infile)).toPath());

			Files.write((new File(outfile)).toPath(),
					allLinesToUpperCase(inlines), 
					StandardOpenOption.CREATE,
					StandardOpenOption.WRITE);
	}
	public static void main(String []args) {
		if (args.length < 2) {
			System.err.println("java TextUpper infile outfile");
			System.exit(1);
		}
		try {
			convertToUpperCase(args[0], args[1]);
		} catch(IOException e) {
			System.err.println(e);
			System.exit(2);
		} catch(SecurityException e) {
			System.err.println(e);
			System.exit(3);
		} catch(Exception e) {
			System.err.println(e);
			System.exit(1);
		}
	}
}
