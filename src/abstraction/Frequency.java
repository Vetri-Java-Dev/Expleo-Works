package abstraction;

import java.util.HashMap;

public class Frequency {
	public static void main(String[] args) {
		
		int[] arr= {1,1,2,2,2,3,3,3,4,4,4};
		
		HashMap<Integer, Integer> map=new HashMap<>();
		
		for(int n : arr) {
			map.put(n, map.getOrDefault(n, 0)+1);
		}
		
		for(int n : map.keySet()) {
			System.out.println(n+" -> "+map.get(n));
		} 
	}
}
