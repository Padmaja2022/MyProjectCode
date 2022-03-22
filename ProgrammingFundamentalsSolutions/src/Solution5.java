import java.util.Scanner;

/*
 * Write a program to ask the user for a decimal number, and print the floor, ceil, round of that number
This question involves java.lang.Math class
 * 
 * 
 */
public class Solution5 {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("please enter the first  decimal number");
		double num1 = input.nextDouble();
		
		System.out.println("please enter the  second decimal number");
		double num2 = input.nextDouble();
		
		//floor
		System.out.println("floor value of  first number is  : " + Math.floor(num1));
		System.out.println("floor value  of  first number is  : " + Math.floor(num2));
		
		//ceil
		System.out.println("ceil value of  first number is  : " + Math.ceil(num1));
		System.out.println("ceil  value of  first number is  : " + Math.ceil(num2));
		
		//round
		System.out.println("round  of  first number is  : " + Math.round(num1));
		System.out.println("round  of  first number is  : " + Math.round(num2));
	}

}
