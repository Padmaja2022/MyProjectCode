import java.util.Arrays;

public class ArrayReverseOrder {
	/*
	 * /*Program to print the elements of an array in reverse order
	 * 
	 * algorithm
	 * 1.initalize array arr[]
	 * 2.print "original array
	 * 3.forloop for(i=0;i<aaray.length;i++)
	 * 4.print arr[i]
	 * 5.print array in reverse order
	 * 6.for(i=arr.length-1;i>=0,i++);
	 * 7.printa[i]
	 */
	public static void main(String[] args) {

		int arr[] = new int[] {1,2,3,4,5};
		System.out.println("print the elements of original array:"  + Arrays.toString(arr));


 
 /*
  *    int temp_array[] = {};
 
		int reverse_count = 0;
		for(int i = arr.length-1; i>=0; i--) {
			System.out.println(arr[i] + " , " + reverse_count);
			temp_array = addElement(temp_array, arr[i]);
			reverse_count++;
		}
		
		System.out.println("print the elements of reverse Arrary:"  + Arrays.toString(temp_array));
	}

	private static int[] addElement(int[] a, int i) {
		a  = Arrays.copyOf(a, a.length + 1);
		a[a.length - 1] = i;
		return a;
  *       
  */
		for(int i = arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
			
		}
 
	}
}