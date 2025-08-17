package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindingSecondLargestNumberUsingList {

	public static void main(String[] args) {
		
		//Declare an array
		int[]array = {3,2,11,4,6,7};
		
		//Declare a list
		List <Integer> list = new ArrayList <Integer>();
		
		for(int num : array) {
			list.add(num);
		}
		
		// Sort the list in ascending
		Collections.sort(list);
		
		//Print the Second Largest number
		int secondLargestNumber = list.get(list.size()-2);
		System.out.println("The Second Largest number is:" + secondLargestNumber);
		}

	}


