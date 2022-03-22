/*
 * author    Padmaja 
 * date       3/22/2022
 * 
 * Description Write a program to reverse the order of words in a sentence
   This question involves String concepts. .split(" ") method i.e split by space, might be helpful here
 */
public class ProgrammingSolution1 {

	public static  void  main(String[] args) {

		String str = "The first program everyone writes Hello World";

		String	nstr = "";
		char ch;	

		System.out.println("Original String");

		System.out.println("The first program everyone writes Hello World");
		for(int i =0; i<=str.length()-1;i++) {

			ch = str.charAt(i);
			nstr= ch+nstr;
		}
		System.out.println("reversed String" +nstr);
	}





}
