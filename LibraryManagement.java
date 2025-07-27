package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Library library=new Library();
         String addBook = library.addBook("Methods and Objects in java");
         System.out.println("Issued:" + addBook);
         library.issueBook();
	}

}
