import java.util.List;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
public class TulisFileText {
	public static void main(String []args) throws IOException {
		List<String> s = Arrays.asList(new String[]{"10", "20", "30"});

            Files.write(new File("hello.txt").toPath(),
                s,
                StandardOpenOption.CREATE,
                StandardOpenOption.WRITE
                );

	}
}
