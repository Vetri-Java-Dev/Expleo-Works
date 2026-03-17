package collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		
		Map<String, Double> map=new HashMap<>();
		
		map.put("aa", 1.0);
		
		map.put("bb", 2.0);
		
		map.put("dd", 2.0);
		
		map.put("cc", 1.0);
		
		map.put("cc", 2.0);
		
		
		Set<Entry<String, Double>> set=map.entrySet();
		
		for(Map.Entry<String, Double> entry : set) {
			System.out.print("Key : "+entry.getKey());
			System.out.print("  Value : "+entry.getValue());
			System.out.println("");
		}
		
		
	}
}
