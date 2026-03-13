package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedStream {
	public static void main(String[] args) {
		
		try {
			BufferedReader input=new BufferedReader(new FileReader(args[0]));
			BufferedWriter output=new BufferedWriter(new FileWriter(args[1]));
			
			String line="";
			
			while((line=input.readLine())!=null) {
				output.write(line);
				output.newLine();
			}
			
			input.close();
			output.close();
			
			System.out.println("Success.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
