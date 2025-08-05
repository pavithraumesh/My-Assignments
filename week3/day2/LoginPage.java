package week3.day2;

public class LoginPage extends BasePage {
	
	public void performCommonTasks() {
		 System.out.println("Performing the tasks"); 
	 }

	 public static void main(String[] args) {
	//Object of BasePage
	BasePage base = new BasePage();
	base.findElement();
	base.clickElement();
	base.enterText();
	base.performCommonTasks();
	
	System.out.println();
	
	// Object of LoginPage // Calls overridden method in LoginPage
	LoginPage login = new LoginPage();
	login.findElement();
	login.clickElement();
	login.enterText();
	login.performCommonTasks();	

	}

	}
