package fileIO;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
	public static void main(String[] args) throws IOException {
		
		FileInputStream input=null;
		
		try {
			
			input=new FileInputStream("src/fileIO/input.txt");
			
			System.out.println("Data in the file : ");
			int i=input.read();
			
			while(i!=-1) {
				System.out.print((char)i);
				i=input.read();
			}
			
			input.close();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
