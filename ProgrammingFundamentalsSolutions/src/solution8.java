import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Write a program that counts the occurances of each word in a text file 
 * (the_prince_quotes.txt in the same repository). Make it case-insensitive by coverting each word to lower case before counting

   Involves text file reading, using String's .split() method, using HashMap to store the word to count mapping
 */
public class solution8 {

	static void CountWords(String filename, Map<String,Integer> words)throws FileNotFoundException {
		
		 Scanner file = new Scanner(new File("C:\\Users\\PadmajaLanka\\OneDrive - Xpanxion\\Desktop\\file.txt"));
		while(file.hasNext()) {
		
		String word = file.next();
		Integer count = words.get(word);
		if(count != null) {
		count++;
		}else {
			count =1;
		
		words.put(word, count);
		
	}
		
		}
		file.close();
	}
	public static void main(String[] args) throws FileNotFoundException {
		
		Map<String,Integer>words = new HashMap<String, Integer>();
		CountWords("file.txt" , words);
		 System.out.println(words);
	}
	
	
	
	
	}
	
	
	
	
	
	
	


