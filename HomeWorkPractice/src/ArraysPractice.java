import java.util.Arrays;

public class ArraysPractice {

/* 1.Program to print the elements of an array
 * 
 * Algorithm;
 *1. initialize  array arr[] = {1,2,3,4,5}
 *2. print elements of given array.
 *3.write for loop for(i=0;i<arr.length; i++);
 *4.print arr[i]
 *end.	
 */
	
	public static void main(String[] args) {
		
		 int arr[] = new int[] {1,2,3,4,5};
		 System.out.println(" elements of given array:");
		
		for(int i = 0;i<arr.length;i++) {
			
			//System.out.println(arr[i]  );
			System.out.println(Arrays.toString(arr));
		}
		
	}
	
	
	
	
}
