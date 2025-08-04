package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	// Two input strings
	String text1 = "Stops";
	String text2 = "potss";
   
	//Check if the Lengths of the two strings are equal
	if(text1.length()!= text2.length()) {
	System.out.println("Lengths mismatch,therefore the strings are not an Anagaram");
	return; // Exit
	}
	
	//Convert both the strings to character arrays
	char[] arr1 = text1.toCharArray();
	char[] arr2 = text2.toCharArray();
	
	//sort both the character array
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	//Check if the sorted arrays are equal
	if (Arrays.equals(arr1, arr2)) {
		System.out.println("The given strings are Anagram.");
	}else {
		System.out.println("The given strings are not an Anagram.");
		
	}
	
	
	
	}

}
