package strings;

import java.util.Scanner;

import javax.crypto.EncryptedPrivateKeyInfo;

public class CorporateCipher {
	
	public static String encrypt(String str) {
		
		StringBuilder cipher=new StringBuilder();
		
		for(char c : str.toCharArray()) {
			if(Character.isAlphabetic(c)) {
				
			}
		}
		return new String(cipher);
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String str=sc.nextLine();
		
		System.out.println("Encrypted string : ");
	}
}
