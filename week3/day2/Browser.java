package week3.day2;

public class Browser {
	
  //Two Variables
	String browserName;
	String browserVersion;
	
	public void openURL() {
		System.out.println("openingURL");
	}
	public void closeBrowser() {
		System.out.println("browserclosed");
	}
	public void navigateBack() {
		System.out.println("navigatedBack");
	}
	
	public static void main(String[] args) {
   //Create objects
	Browser chrome = new Browser();
	chrome.openURL();
	chrome.closeBrowser();
	chrome.navigateBack();
	
	System.out.println();
	}

	}


