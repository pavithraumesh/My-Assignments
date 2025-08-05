package week3.day2;

public class Elements {
	
	   public static void main(String[] args) {
		// creating objects for sub classes and calling their respective methods
		 
		// WebElement (Base class)
        WebElement element = new WebElement();
        element.click();
        element.setText();

        // Button (Subclass)
        Button button = new Button();
        button.click();
        button.submit();

        // TextField (Subclass)
        TextField textField = new TextField();
        textField.click();
        textField.setText();
      
        // CheckBoxButton (inherits from Button)
        CheckBoxButton checkBox = new CheckBoxButton();
        checkBox.click();
        checkBox.submit();
        checkBox.clickCheckButton();

        // RadioButton (inherits from Button)
        RadioButton radioButton = new RadioButton();
        radioButton.click();
        radioButton.submit();
        radioButton.selectRadioButton();
    }

	}


