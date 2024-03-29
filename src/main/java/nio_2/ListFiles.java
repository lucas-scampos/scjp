package nio_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

class ListFiles {
	
	public static void main(String[] args) throws IOException {
		try (Stream<Path> entries = Files.list(Paths.get("."))) {
			entries.forEach(System.out::println);
		}
	}
	
}