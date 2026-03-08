package Arrays;
import java.util.*;

public class MergeSort {
    
    public static int[] sort(int[] arr) {
        
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter number of elements (Array 1): ");
        int n1=sc.nextInt();
        
        int[] arr1=new int[n1];
        
        for(int i=0;i<n1;i++) {
            arr1[i]=sc.nextInt();
        }

        System.out.print("Enter number of elements (Array 2): ");
        int n2=sc.nextInt();
        
        int[] arr2=new int[n2];
        
        for(int i=0;i<n2;i++) {
            arr2[i]=sc.nextInt();
        }

        System.out.print("Enter number of elements (Array 3): ");
        int n3=sc.nextInt();
        
        int[] arr3=new int[n3];
        
        for(int i=0;i<n3;i++) {
            arr3[i]=sc.nextInt();
        }

        int[] result=new int[n1 + n2 + n3];

        int index=0;

     // Copy arr1
        for(int i=0;i<n1;i++) {
            result[index++]=arr1[i];
        }

        // Copy arr2
        for(int i=0;i<n2;i++) {
            result[index++]=arr2[i];
        }

        // Copy arr3
        for(int i=0;i<n3;i++) {
            result[index++]=arr3[i];
        }

        System.out.println(Arrays.toString(sort(result)));

    }
}
