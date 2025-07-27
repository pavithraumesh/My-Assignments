package week2.day1;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 12121;
		int original = input;   //12121
		int reversedNumber = 0;
					
			for (int i = input; i>0; i = i/10 ) {
				int remainder = i % 10;
				reversedNumber = (reversedNumber * 10) + remainder;
			}
			if (original == reversedNumber) {
				System.out.println(original + " It is a palindrome");
			} else {
				System.out.println(original + " It is not a palindrome");
			}
			
		}
	}