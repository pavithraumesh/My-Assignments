package week3.day2;

public class WebElement {
	
	//Method for WebElement
	
	public void click() {
		System.out.println("Element clicked");
	}

	public void setText() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		// Create Object - WebElement (base class)		
        WebElement element = new WebElement();
        element.click();
        element.setText();
	}

}
