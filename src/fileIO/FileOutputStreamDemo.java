package fileIO;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		
		String data="Hello bruthaa !!";
		
		try {
			FileOutputStream output=new FileOutputStream("src/fileIO/output.txt");
			
			byte[] array=data.getBytes();
			
			output.write(array);
			
			System.out.println("Success");
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
