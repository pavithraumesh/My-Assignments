package week3.day2;

public class Button extends WebElement {
	
     // Button class inherits WebElement
   	
	// Method for Button
	public void submit() {
		System.out.println("Button Submitted");
	}
	
	public static void main(String[] args) {
		// Create Object for Button
		Button button = new Button();
        button.submit();
        
       

	}

}
