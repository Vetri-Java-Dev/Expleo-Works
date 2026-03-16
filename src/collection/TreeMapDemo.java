package collection;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		
		TreeMap<String, Double> map=new TreeMap<>();
		
		map.put("John doe",1.0);
		map.put("Tom smith",2.0);
		map.put("Jane baker",3.0);
		map.put("Ralph smith",6.0);
		
		System.out.println(map);
	}
}
