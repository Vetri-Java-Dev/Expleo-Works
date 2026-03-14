package generics;
import java.util.*;

public class Wildcardgeneric {
	
	public static double sum(List<? extends Number> list) {
		double sum=0;
		
		for(Number n : list) {
			sum+=n.doubleValue();
		}
		
		return sum;
	}
	public static void main(String[] args) {
		
		List<Number> list=new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("Sum : "+sum(list));
		
	}
}
