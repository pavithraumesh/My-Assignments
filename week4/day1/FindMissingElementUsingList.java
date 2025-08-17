package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementUsingList {

	public static void main(String[] args) {
		
	// Declare an array
    
	int[]array = {1,2,3,4,10,6,8};
	
	//Declare a list
	List <Integer> list = new ArrayList <Integer>();
	
	//Convert array to list
	for (int num : array) {
		list.add(num);
	}
	
	// Collection in ascending order
	Collections.sort(list);
	
	//Check for the Missing Element
	System.out.println("Missing elements in the sequence:");
	
	for (int i =0; i< list.size()-1; i++) {
	if (list.get(i)+1 != list.get(i+1)) {
		
	// Print the missing number
	System.out.println(list.get(i)+1);
		}
	}
	}
}
