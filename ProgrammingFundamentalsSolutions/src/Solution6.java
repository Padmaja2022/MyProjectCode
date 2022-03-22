import java.util.HashSet;
import java.util.Scanner;

/*author   Padmaja Lanka
 * date    3/22/2022
 *Description: 
Write a program to ask the user for states they have visited in the US. 
Ignore case by converting their input to lower case. Ignore duplicate inputs. 
Order of input doesn't matter. The program runs forever until the user types "done". 
When the user types "done", display the unique list of states back to the user.
Use one of the collection framework classes.
 * 
 */
public class Solution6 {
	public static void main(String[] args) {
		String userInput = "";
		HashSet<String> state_names = new HashSet<String>(); // hashset
		Scanner input =new Scanner(System.in);//scanner class
		do { 
			System.out.println(" Enter the states you are visited in US?  " );
			System.out.println(" Enter the state name:  " );
			userInput = input.nextLine().toLowerCase();
			if (!userInput.equalsIgnoreCase("done")) {
				state_names.add(userInput);
			}
		} while(!userInput.equalsIgnoreCase("done"));

		input.close();

		System.out.println(state_names);
	}
}