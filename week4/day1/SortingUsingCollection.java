package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
	//Declare a String Array
		
	String [] companies = {"HCL","Wipro", "Aspire Systems", "CTS"};
	
	//convert array to a list
	List <String> companyList = new ArrayList<>(Arrays.asList(companies));
	
	//Sorting in ascending order
	Collections.sort(companyList);
	
	// Iterate and Print the list in reverse order(with reverse loop)
	for (int i = companyList.size()-1; i>=0; i--) {
	System.out.println(companyList.get(i));
	}
	}
}
