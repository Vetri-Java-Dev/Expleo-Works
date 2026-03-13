package fileIO;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathDemo {
	public static void main(String[] args) {
		
		Path p1=Paths.get("C:\\Program Files\\Java\\jdk-25.0.2\\bin");
		Path p2=p1.subpath(1, 3);
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
