package collection;

import java.lang.classfile.attribute.NestHostAttribute;
import java.util.PriorityQueue;

class Task implements Comparable<Task>{

	private String name;
	private int priority;
	
	public Task(String name,int priority) {
		this.name=name;
		this.priority=priority;
	}
	
	public String getName() {
		return name;
	}
	
	public int compareTo(Task o) {
		return this.priority-o.priority;
	}

	@Override
	public String toString() {
		return "Name : "+name+"  Priority : "+priority;
	}
	
	
	
}
public class PriorityQueueDemo {
	public static void main(String[] args) {
		
		PriorityQueue<Task> tasks=new PriorityQueue<>();
		
		Task task1=new Task("Vetri",1);
		tasks.offer(task1);
		
		Task task2=new Task("Vicky",2);
		tasks.offer(task2);
		
		Task task3=new Task("Tyler",3);
		tasks.offer(task3);
		
		Task task4=new Task("Durden",4);
		tasks.offer(task4);
		
		
		for(Task task : tasks) {
			System.out.println(task);
		}
		
		/*minHeap.offer("b");
		minHeap.offer("a");
		minHeap.offer("c");
		minHeap.offer("e");
		minHeap.offer("d");
		
		System.out.println("Before removal : "+minHeap);
		
		minHeap.poll();
		minHeap.poll();
		
		System.out.println("After removal : "+minHeap);*/
		
	}
}
