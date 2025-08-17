package week4.day1;

public class AbstractionDemo {

	public static void main(String[] args) {
		// Creating an object
		
	 JavConnection db = new JavConnection();
	 db.connect();
	 db.disconnect();
	 db.executeUpdate();
	 db.executeQuery();
	 
	}

}
