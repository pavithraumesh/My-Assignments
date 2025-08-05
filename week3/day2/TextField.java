package week3.day2;

public class TextField extends WebElement{
	
	// Method for TextField
		public void getText() {
			System.out.println("Say Hello");
		}

	public static void main(String[] args) {
		// Create Object for Textfield
        TextField textField = new TextField();
        textField.getText();

	}

}
