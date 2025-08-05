package week3.day2;

public class ReverseOddWords {

	public static void main(String[] args) {
	// Reverse the odd position words from a String with the input
    String test = "I am a software tester";
    
    //Split the words
    String[] words = test.split(" ");
    
    // Looping
    for (int i = 0; i < words.length; i++) {
    	if (i % 2!= 0) {
    		
    // Convert the String array into a character array
    char[] chars = words[i].toCharArray();
    for (int j = chars.length-1; j>= 0; j--) {
    	System.out.print(chars[j]);
    }    	
    
    	}
    	else {
    	System.out.print(words[i]);
    		      	}
    	System.out.print(" ");
    }
	}
	}


