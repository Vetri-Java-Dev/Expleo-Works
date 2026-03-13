package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveFileDirectory {
	
	public static void main(String args[])  {
		
		Path source=Paths.get("D:\\Source\\sample.java");
		Path target=Paths.get("D:\\Target\\movedSample.java");
		
		try {
			System.out.println(source+" "+ "Moved to:"+" "+ Files.move(source,
			target,StandardCopyOption.REPLACE_EXISTING));
		}
		
		catch(IOException e){
			System.out.println(e); 
		}
		
		//System.out.println(Files.getLastModifiedTime(source));
		
	}
} 