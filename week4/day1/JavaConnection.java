package week4.day1;

public class JavaConnection implements DatabaseConnection {

	public void connect() {
		System.out.println("Connecting to the Database");
	}
    public void disconnect() {
    	System.out.println("Disconnecting from the Database");
    }
    public void executeUpdate() {
    	System.out.println("Executing update in Database");
    }
}
