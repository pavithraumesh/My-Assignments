package week3.day2;

public class InheritanceDemo {

	public static void main(String[] args) {
		// Creating object of superclass
        TestData details = new TestData();
        System.out.println("Calling methods from TestData: ");
        
        details.enterCredentials();
        details.navigateToHomePage();

        System.out.println();

        // Creating object of subclass
        LoginTestData credentials = new LoginTestData();
        System.out.println("Calling methods from LoginTestData (including inherited ones): ");
        credentials.enterCredentials();       // inherited method
        credentials.navigateToHomePage();     // inherited method
        credentials.enterUsername();          // subclass method
        credentials.enterPassword();          // subclass method
    }

	}


