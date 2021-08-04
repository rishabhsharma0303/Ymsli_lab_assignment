package Assignment6.ques3;

public class Book implements Comparable<Book> {

String bookName;
String author;
public Book( String bookName, String author) {

	
	this.bookName = bookName;
	this.author = author;
}


public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
@Override
public String toString() {
	return "Book Name:"+bookName+"Author:"+author;
}


@Override
public int compareTo(Book o) {
	// TODO Auto-generated method stub
	if(bookName.compareTo(o.bookName)==0) {
		return author.compareTo(o.author);
	}
	return bookName.compareTo(o.bookName);
}


}
