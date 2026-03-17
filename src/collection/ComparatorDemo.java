package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class Mobile implements Comparable<Mobile>{
	
	private String name;
	private int ram;
	private int price;
	
	public Mobile(String name, int ram, int price) {
		super();
		this.name = name;
		this.ram = ram;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Mobile o) {
		return o.getPrice()-this.price;
	}
	
	
}

class NameSort implements Comparator<Mobile>{

	public int compare(Mobile o1, Mobile o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

class PriceSort implements Comparator<Mobile>{

	public int compare(Mobile o1, Mobile o2) {
		return o1.getPrice()-o2.getPrice();
	}
	
}
public class ComparatorDemo {
	public static void main(String[] args) {
		
		ArrayList<Mobile> mobiles=new ArrayList<>();
		
		mobiles.add(new Mobile("Redmi",16,100));
		mobiles.add(new Mobile("Vivo",8,200));
		mobiles.add(new Mobile("Samsung",6,300));
		mobiles.add(new Mobile("Apple",4,4000));
		mobiles.add(new Mobile("Realme",3,400));
		
		PriceSort comparator=new PriceSort();
		
		Collections.sort(mobiles,comparator);
		
		for(Mobile mobile : mobiles) {
			
			System.out.println(mobile.getName());
			System.out.println(mobile.getRam());
			System.out.println(mobile.getPrice());
			
			System.out.println("");
			
		}
		
	}
}
