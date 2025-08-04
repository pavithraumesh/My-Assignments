package week3.day1;

public class Reversethegivenstring {

	public static void main(String[] args) {
						
		String companyName = "Testleaf";
		
		// to CharArray - Convert a String into Character Array
		char[]charArray = companyName.toCharArray();
				
		//Reverse and loop from the end of the array to the start
		System.out.print("Reversed String:");
		
		for (int i = charArray.length-1; i>=0; i--) {
		System.out.print(charArray[i]);

		}
				
	}

}
