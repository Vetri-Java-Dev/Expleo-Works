package fileIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathOperation {
	public static void main(String[] args) {
		
		Path path=Paths.get("C:\\Program Files\\Java\\jdk-25.0.2\\bin");
		
		System.out.println("Normalized path : "+path.normalize());
		System.out.println("File name : "+path.getFileName());
		System.out.println("Name count : "+path.getNameCount());
		System.out.println("Root : "+path.getRoot());
		System.out.println("Parent : "+path.getParent());
		System.out.println("Sub path 1-3 : "+path.subpath(1, 3));
		System.out.println("Is Absolute : "+path.isAbsolute());
		System.out.println("Absolute path : "+path.toAbsolutePath());
		System.out.println("toUri : "+path.toUri());
		
		Path path2=path;
		
		if(path.equals(path2)) {
			System.out.println("Same path.");
		}
		else {
			System.out.println("Not same path.");
		}
	}
}
