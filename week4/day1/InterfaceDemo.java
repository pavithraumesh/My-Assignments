package week4.day1;

public class InterfaceDemo {

	public static void main(String[] args) {
	// Implementations for the abstract methods in the Concrete class
	
		DatabaseConnection options = new JavaConnection();
		options.connect();
		options.disconnect();
		options.executeUpdate();

	}

}
