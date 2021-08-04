package Assignment6.ques3;

import java.util.Arrays;

public class BookCollection {
	String ownerName;
	Book books[];
	public BookCollection(String ownerName, Book[] books) {
		
		this.ownerName = ownerName;
		this.books = books;
	}
	
	@Override
	public String toString() {
	String temp="Books Collection \n";
	for(Book b:books) {
		temp+=(b.toString()+"\n");
	}
	return temp;
	}
	public boolean hasBook(Book b) {
		boolean isFound=false;
		for(Book bk:books) {
			if((bk.getBookName()==b.getBookName()) && (bk.getAuthor()==b.getAuthor())){
			isFound=true;
		}
		}
		return isFound;
		
	}
	
	public void Sort()
	{
		 Arrays.sort(books);
	}
	
	
}
