/*
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;
public class Solution1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a sentense and the words will be printed in reverse order");
		String input =sc.nextLine();
		String s[]=input.split("");
		for(int i=s.length-1;i>=0; i--) {
			input +=s[i]+"";
		}
		String x= s.toString();
		System.out.println(x);
		System.out.println("Sentence reversed:"+ input);
		sc.close();
	}

}
