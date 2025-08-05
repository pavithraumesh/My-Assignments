package week3.day2;


//Superclass
public class TestData {
	
	//Implement 2 methods
	public void enterCredentials() {
		System.out.println("Entered the Credentials");
	}

	public void navigateToHomePage() {
		System.out.println("Navigating to HomePage");
	}
	public static void main(String[] args) {
		// Create an object
		
	TestData details = new TestData();
	details.enterCredentials();
	details.navigateToHomePage();
	

	}

}
