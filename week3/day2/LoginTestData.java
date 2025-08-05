package week3.day2;

    //Subclass that inherits from TestData
    public class LoginTestData extends TestData{
	
    // Implement 2 Methods
	public void enterUsername() {
		System.out.println("Username Entered");
	}

	public void enterPassword() {
		System.out.println("Password Entered");
	}

	public static void main(String[] args) {
		
	// Create an object
	LoginTestData credentials= new LoginTestData();
	credentials.enterUsername();
	credentials.enterPassword();
	
			
	}

}
