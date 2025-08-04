package week3.day1;

public class FindIntersection {

	public static void main(String[] args) {
		// Declaring an Array
		int a[]= {3 ,2 ,11 ,4 ,6 ,7};
		// Declaring another array for
		int b[]= {1 ,2 ,8 ,4 ,9 ,7};
		
		// Nested loop to compare elements of both arrays
        for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < b.length; j++) {
        	
        // If a match is found, print the element
        if (a[i] == b[j]) {
        System.out.println("Matching element: " + a[i]);
		
		
        }	
	}
        }
}
}