package week4.day1;

public class JavConnection extends MySqlConnection {

	public void connect() {
	System.out.println("JavConnection: Connecting to MySQL database");
		}
	
	public void disconnect() {
	System.out.println("JavConnection: Disconnecting from MySQL database");
		
		}
   
	public void executeUpdate() {
	System.out.println("JavConnection: Executing the update in database");
		
	   }
	
	public void executeQuery() {
	System.out.println("JavConnection: Executing query");
	}
}  
