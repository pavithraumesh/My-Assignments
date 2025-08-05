package week3.day2;

public class BasePage {
	
	//Methods : findElement
	public void findElement() {
		System.out.println("Find the Element");
	}
	
	//Methods : clickElement
	 public void clickElement() {
		 System.out.println("Click on it"); 
	 }
	 
	//Methods : enterText
	 public void enterText() {
		 System.out.println("Entered the text"); 
	 }
	 
	//Methods : performCommonTasks
	 public void performCommonTasks() {
		 System.out.println("Performing the tasks"); 
	 }

	 public static void main(String[] args) {
	// create an object
	BasePage base = new BasePage();
	base.findElement();
	base.clickElement();
	base.enterText();
	base.performCommonTasks();	

	}

}
