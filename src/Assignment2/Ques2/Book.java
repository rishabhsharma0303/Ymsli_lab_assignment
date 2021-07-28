package Assignment2.Ques2;

public class Book {
String bookTitle;

String author;
String isbn;
int numOfCopies;
public Book(String bookTitle, String author, String isbn, int numOfCopies) {
	super();
	this.bookTitle = bookTitle;
	this.author = author;
	this.isbn = isbn;
	this.numOfCopies = numOfCopies;
}

public String getBookTitle() {
	return bookTitle;
}
public void setBookTitle(String bookTitle) {
	this.bookTitle = bookTitle;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public int getNumOfCopies() {
	return numOfCopies;
}
public void setNumOfCopies(int numOfCopies) {
	this.numOfCopies = numOfCopies;
}
public void display() {
	System.out.println("Title – Author – ISBN –Quantity:"+bookTitle+"-"+author+"-"+isbn+"-"+numOfCopies);
}
}
