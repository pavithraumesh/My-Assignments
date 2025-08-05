package week3.day2;

public class CheckBoxButton extends Button {
	
	//Method for CheckBoxButton
	public void clickCheckButton() {
		System.out.println("Checkbox button clicked");
	}

	public static void main(String[] args) {
		// Create object
		CheckBoxButton checkBox = new CheckBoxButton();
        checkBox.clickCheckButton();
	}

}
