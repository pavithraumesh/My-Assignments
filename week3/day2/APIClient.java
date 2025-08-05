package week3.day2;

public class APIClient {
	
	//One arguments : string (endpoint) 
	public void sendRequest(String endpoint) {
		System.out.println("Complete till " + endpoint);
	}
	
	//Three arguments : string (endpoint), string(requestBody), boolean(requestStatus) 
	public void sendRequest(String endpoint, String requestBody,boolean requestStatus) {
		System.out.println("Complete till " + endpoint);
		System.out.println("Verify the " + requestBody);
		System.out.println("Check whether " + requestStatus);
		
	}	

	public static void main(String[] args) {
		// Create an object
		APIClient points = new APIClient();
		points.sendRequest("endpoint");		
		points.sendRequest("endpoint","requestBody", true);
				
				

	}

}
