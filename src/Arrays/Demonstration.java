package Arrays;

public class Demonstration {
	public static void main(String[] args) {
		
		int[] marks=new int[3];
		
		marks[0]=99;
		marks[1]=95;
		
		for(int mark : marks) {
			System.out.println(mark);
		}
		
		System.out.print(marks[0]);
	}
}
