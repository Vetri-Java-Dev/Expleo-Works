package collection;

import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorExample {
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println("Using tryAdvance : ");
		
		Spliterator<Integer> itr=list.spliterator();
		while(itr.tryAdvance(n->System.out.print(n+" ")));
		
		System.out.println("");
		
		System.out.println("Using forEachRemaining : ");
		
		itr=list.spliterator();
		itr.forEachRemaining(n->System.out.print(n+" "));
	}
}
