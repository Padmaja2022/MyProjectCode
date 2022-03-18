import java.util.Arrays;

public class ArraysEvenOdd {
	/*
	 * Algorithm
	 * 1.initialize arr[] = {1,2,3,4,5,6,8,7,9,10}
	 * print elements of given array
	 * for loop for(int i = 0; i,arr.length; i++);
	 * 
	 * if (i %2 =0)
	 * print array of even numbers
	 * else( i %2 !=0)
	 * print array of odd numbers
	 * 
	 */
	public static void main(String[] args) {

		int arr[]	= new int [] {1,2,3,4,6,7,8,9,10};
		System.out.println(Arrays.toString(arr));
		
//		int odd_array[] = {};
//		int even_array[] = {};
		
		for ( int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
		
			if( arr[i] % 2 == 0) {
				System.out.println("print even numbers: " +  arr[i]);
//				even_array[i] = arr[i];
			}
			else {
				System.out.println("Print odd numbers in array:" +arr[i]);
//				odd_array[i] = arr[i];
			}
		}
		
//		System.out.println(Arrays.toString( even_array));
//		System.out.println(Arrays.toString( odd_array));
	}
	
}
