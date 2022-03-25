import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author PadmajaLanka
 *
 */
public class Solution9Main {
	
	ArrayList<Song> playList =new  ArrayList<Song>();	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 1. add some songs data to the playList
		Scanner sc = new Scanner(System.in);
		String input_value; 
		do {
			System.out.println("Enter the Song Title : ");
			input_value = sc.nextLine();
			System.out.println("Enter the Song Duration : ");
			double duration_value = sc.nextDouble();
			Song s = new Song(input_value, duration_value);
			PlayList.playList.add(s);
			
			System.out.println("Do you want to add more songs (Yes/No): ");
			input_value = sc.nextLine();
			input_value = sc.nextLine();
	   
			
		} while(!input_value.equalsIgnoreCase("done"));
		

		
		// display the songs in playList
		for(Song song: PlayList.playList) {
			System.out.println("Song names in he PlayLists: " + song.getTitle());
		}
		
		// find the song name in the playList
		System.out.println("Enter the Song Name to find: ");
		input_value = sc.nextLine();
		if (PlayList.findSong(input_value)) {
			System.out.println("The song '" + input_value + "' found in the playlsit");
		} else {
			System.out.println("The song '" + input_value + "' NOT found in the playlsit");
		}
		
		sc.close();
		}
	}

