package fileIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SymLinkPath {
	public static void main(String[] args) {
		
		Path path=Paths.get("C:\\Program Files\\Java\\jdk-25.0.2\\bin");
		Path symbolicPath=Paths.get("F:\\symlink");
		
		System.out.println(Files.notExists(symbolicPath));
	}
}
