package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		
    //Declare and Initialize 
	int[] array1 = {3 ,2, 11, 4, 6, 7};
	int[] array2 = {1 ,2, 8, 4, 9, 7};
	
	// Adding array elements to a list
	List<Integer> list1 = new ArrayList<>();
	
	//iterating through the length of the list
	for (int num : array1) {
		list1.add(num);
	}
	
	List<Integer> list2 = new ArrayList<>();
	
	for (int num : array2) {
		list2.add(num);
	}
	
	// Intersection 
	System.out.println("Intersection of two arrays:" );
	
	for(int num : list1) {
		if ( list2.contains(num)) {
			System.out.println(num);
		}
	}
	}
}


