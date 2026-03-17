package collectionHandson;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCount {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		Map<Character,Integer> map=new HashMap<>();
		
		System.out.print("Enter String : ");
		String str=scanner.nextLine();
		
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(char c : map.keySet()) {
			if(c==' ')
				System.out.println("Spaces -> "+map.get(c));
			else
				System.out.println(c+" -> "+map.get(c));
		}
	}
}
