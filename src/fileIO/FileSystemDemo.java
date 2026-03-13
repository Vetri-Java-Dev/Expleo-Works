package fileIO;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemDemo {
	public static void main(String[] args) {
		
		FileSystem fs=FileSystems.getDefault();
		
		Path p1=fs.getPath("C:\\Program Files\\Java\\jdk-25.0.2\\bin");
		Path p2=p1.subpath(1, 3);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
