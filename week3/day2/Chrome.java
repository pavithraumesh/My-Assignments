package week3.day2;

public class Chrome extends Browser{
	
	//Method specific to Chrome
	public void openIncognito() {
		System.out.println("openIncognito");
	}
	
	public void clearCache() {
		System.out.println("clearCache");
	}
    
	public static void main(String[] args) {
	    //Create objects
		Chrome chrome = new Chrome();
		chrome.openURL();
		chrome.closeBrowser();
		chrome.navigateBack();
		chrome.openIncognito();
		chrome.clearCache();
				
		System.out.println();
		}
	}


