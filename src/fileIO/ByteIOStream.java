package fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteIOStream {
	public static void main(String[] args) {
		
		byte[] b=new byte[128];
		
		try {
			FileInputStream input=new FileInputStream("src/fileIO/input.txt");
			FileOutputStream output=new FileOutputStream("src/fileIO/output.txt");
			
			System.out.println("Bytes avail : "+input.available());
			
			int count=0;
			int read=0;
			
			while(input.read(b)!=-1) {
				output.write(b);
				
				count+=read;
			}
			
			System.out.println("Total Count : "+count);

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
