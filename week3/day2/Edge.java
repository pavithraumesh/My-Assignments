package week3.day2;

public class Edge extends Browser{
	//Method specific to Edge
		public void takeSnap() {
			System.out.println("takeSnap");
		}
		
		public void clearCookies() {
			System.out.println("clearCookies");
		}
	    
		public static void main(String[] args) {
		    //Create objects
			Edge edge = new Edge();
			edge.openURL();
			edge.takeSnap();
			edge.clearCookies();
			edge.closeBrowser();
			edge.navigateBack();
					
			System.out.println();
			}
		}

