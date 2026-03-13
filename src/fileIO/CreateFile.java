package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile{
	public static void main(String args[]) {
		
		try{
			Path path = Paths.get("D:\\newFolder\\sample.java");
			
			if (!Files.exists(path)) {
				Files.createFile(path);
				System.out.println("File created");
			}
			else {
				System.out.println("File already exists");
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
