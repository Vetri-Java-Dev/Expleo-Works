package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ComparableDemo {
	public static void main(String[] args) {
		
		ArrayList<Mobile> mobiles=new ArrayList<>();
		
		mobiles.add(new Mobile("Redmi",16,100));
		mobiles.add(new Mobile("Vivo",8,200));
		mobiles.add(new Mobile("Samsung",6,300));
		mobiles.add(new Mobile("Apple",4,4000));
		mobiles.add(new Mobile("Realme",3,400));
		
		Collections.sort(mobiles);
		
		System.out.println("Ram based sorting : ");
		
		for(Mobile mobile : mobiles) {
			
			System.out.println("Name : "+mobile.getName());
			System.out.println("Ram : "+mobile.getRam());
			System.out.println("Price : "+mobile.getPrice());
			
			System.out.println("");
			
		}
		
	}
}
