/*author    Padmaja 
 * date       3/22/2022
 * 
 * Description  Write a program to ask the user to enter a year and tell them if it's a leap year or not
   A leap year is divisible by 4 but not divisible by 100, OR it is divisible by 400
 */

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the Year");
		int year =input.nextInt();


		//Is it leap year

		boolean leap = false;

		//if the year is divided by 4


		if(year %4 ==0 || year %400 ==0) {

			System.out.println("Entered year is a leap year");

		} else if (year % 100 !=0 ) {

			System.out.println("It's  not a leap year");

		}
	}
}