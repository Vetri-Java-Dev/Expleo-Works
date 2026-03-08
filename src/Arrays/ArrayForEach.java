package Arrays;

public class ArrayForEach {
	public static void main(String[] args) {
		
		int[] arr=new int[3];
		
		arr[0]=99;
		arr[1]=95;
		
		for(int e : arr) {
			System.out.println(e);
		}
		
		System.out.print(arr[0]);
	}
}
