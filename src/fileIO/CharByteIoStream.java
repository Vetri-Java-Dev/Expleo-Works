package fileIO;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class CharByteIoStream {
	public static void main(String[] args) {
		
		char[] b=new char[128];
		
		try{
			
			FileReader input=new FileReader(args[0]);
			FileWriter output=new FileWriter(args[1]);
			
			int count=0;
			int read=0;
			
			while((read=input.read(b))!=-1) {
				output.write(b);
				
				count+=read;
				
				System.out.println(Arrays.toString(b));
			}
			
			System.out.println("Total count : "+count);
			
			input.close();
			output.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
