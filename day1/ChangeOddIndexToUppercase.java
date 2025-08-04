package week3.day1;

public class ChangeOddIndexToUppercase {
		 
	public static void main(String[] args) {
		
		String test = "changeme";
		
		// convert a string to a character array
		char[]charArray = test.toCharArray();
		
		// Iterate through each character
		for(int i=0; i<charArray.length; i++)
			
		//Check if the index is Odd
		if(i%2!=0)
		
		//Convert character to uppercase if index is odd
		charArray[i]=Character.toUpperCase(charArray[i]);
		
		{
		System.out.println("Result:" );
					
		for (char ch : charArray) {
			System.out.print(ch);
		}
		}
		
		

	}

}
