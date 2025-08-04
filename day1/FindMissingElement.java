package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
	 // Java code to print Missing Number in the console
	 int[] arr = {1 ,4 ,3 ,2 ,8 ,6 ,7 };
	   
	//To sort the array variable {1 ,4 ,3 ,2 ,8 ,6 ,7};
	//Index Value     0  1  2  3  4  5  6  7
	Arrays.sort(arr);
	   	   
	//loop through the array
	for(int i = 0; i<arr.length; i++) {
	    	
    // Check if the iterator variable is not equal to the array values respectively
	if (arr[i]!= i+1) {
		   
    //Print the missing number
	System.out.println("Missing number is:"  + (i+1));
	break;
		   
	   }
	    }
	}

}
