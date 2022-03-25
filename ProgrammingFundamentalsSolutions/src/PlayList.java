import java.util.ArrayList;

/*
 * Create a PlayList class which has instance 
 	attributes
		name
		ArrayList of Songs called playList
	Methods:
		Print all songs in the playlist
		Find song by name : findSong(String song) returns true if the song name is present in the playList HINT: .getName().equals()
 */
public class PlayList {
	
	// local variables
	static String name;
	static ArrayList<Song> playList =new  ArrayList<Song>();	
	
	
	
	// Methods 
	// 1. printAllSongs()
	public static void printAllSongs() {
		for(Song song : playList) {
			System.out.println("Each Song in playlist : " + song.getTitle());
		}
	}
	
	
	// 2. findSong(String song)
	public static boolean findSong(String song_name) {
		boolean returnValue = false;
		for(Song song : playList) {
			String temp_name = song.getTitle();
			if (temp_name.equalsIgnoreCase(song_name)) {
				returnValue = true;
				break;
			}
		}
		return returnValue;				
	}
	
}
