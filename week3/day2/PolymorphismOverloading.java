package week3.day2;

public class PolymorphismOverloading {

	//Two arguments : string (msg) and string (status)
	public void reportStep(String msg, String status) {
		System.out.println("Message is " + msg);
		System.out.println("Status is " + status);
	}
	// Three arguments : string(msg), string(status) and a boolean (snap)
	public void reportStep(String msg, String status, boolean snap) {
		 System.out.println("Message is " +  msg);
		 System.out.println("Status is " +  status);
		 System.out.println("Photo captured " +  snap);
	}
	public static void main(String[] args) {
		// Create an object
		PolymorphismOverloading options = new PolymorphismOverloading();
		options.reportStep("Sent", "Updated");
		options.reportStep("Photo captured","Updated", true);

	}

}
