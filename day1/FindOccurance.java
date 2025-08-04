package week3.day1;

public class FindOccurance {

	public static void main(String[] args) {
		
		String input = "Testleaf";
		// To get the count of e;
		int count = 0;
		
		//Convert a string to a Character Array
		char[]charArray=input.toCharArray();
		
		//Use for loop to iterate through each character
		for(int i=0; i < charArray.length; i++) {
		
		//Compare each character with 'e'
		if (charArray[i] == 'e') {
		count++;
		}
		}
		// Final Output
		System.out.println("The count of 'e' is : " + count);
		}
		
	}
	
		
		
		
	

