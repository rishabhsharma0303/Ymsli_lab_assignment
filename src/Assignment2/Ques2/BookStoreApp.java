package Assignment2.Ques2;
import java.util.*;
public class BookStoreApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStore bookStore=new BookStore();
		while(true) {
		System.out.println("Enter 1 to display the Books: Title – Author – ISBN - Quantity.");
		System.out.println("Enter 2 to order new books");
		System.out.println("Enter 3 to sell books");
		System.out.println("Enter 0 to exit the system.");
		Scanner sc=new Scanner(System.in);
	int 	key=sc.nextInt();

switch (key) {
case 0:
	System.exit(1);
	break;
	
case 1:
	bookStore.display();
	break;
	
case 2:
	System.out.println("Enter the isbn");
	
	String isbn=sc.nextLine();
	System.out.println("Enter the no of copies");
	int numOfcopies=sc.nextInt(); 
	
	bookStore.order(isbn, numOfcopies);
	break;

	
case 3:
	
	System.out.println("Enter the title");
	String title=sc.nextLine();
	System.out.println("Enter the no of copies");
	int numOfcopie=sc.nextInt(); 
	bookStore.sell(title, numOfcopie);
	break;
default:
	break;
}

	}
	}

}
