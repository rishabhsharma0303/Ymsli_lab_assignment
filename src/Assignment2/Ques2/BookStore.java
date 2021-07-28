package Assignment2.Ques2;

public class BookStore {
Book books[]=new Book[10];
int size=-1;

void sell(String title,int numOfcopies) {
	//search using title in array
//	for(int i=0;i<books.length;i++) {
//		String var=books[i].bookTitle;
//		if(var.equals(title)) {
//			books[i].numOfCopies=books[i].numOfCopies-1;
//		}
//	}
	int size=-1;
	
	int fg=0;
	
	if(size<0) {
		System.out.println("store has no books,please order");
	}
	
	for(int i=0;i<=size;i++) {
		String var=books[i].bookTitle;
		if(var.equals(title)) {
			if(books[i].getNumOfCopies()==1) {
				books[i]=null;
				fg=1;
				size--;
				System.out.println("books sold and now gets out of stock");
			}else {
				fg=1;
				books[i].numOfCopies=books[i].numOfCopies-1;
				System.out.println("books sold ");
			}
			
			
		}
	}
	if(fg==0) {
		System.out.println("book not found");
	}
	
	
	
	
}

void order(String isbn,int numOfcopies) {
	//iterate over the books array using isbn vale
	for(int i=0;i<=size;i++) {
		if(isbn.equals(books[i].isbn)) {
			books[i].numOfCopies=books[i].numOfCopies+1;
			System.out.println("Books added in store");
			return;
		}
	}
	if(size<10) {
		size++;
		books[size]=new Book("new Book", "Chetan bhagat", isbn,numOfcopies);
		System.out.println("book added ");
	}else {
		System.out.println("book array is full, can not order more books");
	}
	
}
void display() {
	if(size>=0) {
		for(int i=0;i<books.length;i++) {
			books[i].display();
		}
	}else {
		System.out.println("books array is empty");
	}
	
}

}
