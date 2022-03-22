import java.util.Scanner;

/*author  Padmaja
 * Date    3/22/2022
 * Description:
 * Write a program that asks user for 2 integers and print the divison of the 2 integers. 
 * Handle ArithmeticException and print its stacktrace. Handle all other RuntimeException 
 * and print its message. Irrespective of whether an exception ocurred or not, print a "Thank you" message
 * 
 */
public class Solution7 {



	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1,num2;
		try {
			System.out.println("please enter the first number");
			num1=input.nextInt();

			System.out.println("please enter the second number");
			num2 =input.nextInt();

			System.out.println("the division of two tnumbers is" + num1/num2);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("Thank you");
			input.close();
		}

	}

}
