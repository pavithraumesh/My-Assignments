package week3.day2;

public class Safari extends Browser{
	
	//Method specific to Safari
			public void readerMode() {
				System.out.println("readerMode is working");
			}
			public void fullScreenMode(){
				System.out.println("fullScreenMode is working");
			}
		    
			public static void main(String[] args) {
			    //Create objects
				Safari safari = new Safari();
				safari.openURL();
				safari.readerMode();
				safari.fullScreenMode();
				safari.closeBrowser();
				safari.navigateBack();
						
				System.out.println();
				}
}


	