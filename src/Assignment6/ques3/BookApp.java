package Assignment6.ques3;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book books[] = { new Book("Cheque book", "Vasdev Mohi"), 
				 new Book("Politics of Opportunism", "R P N Singh"), 
				 new Book("Malayalam poetry", "Akkitham Achuthan Namboodri	"), 
				 new Book("The Testaments", "Margaret Atwood"),
				 new Book("Fakir Hassen", "Roopa Pai"),
				 new Book("Celestial Bodies", "Jokha Alharthi"),
				 new Book("New India", "APJ Abdul Kaalam"),
				 new Book("Old India", "Richard Powers"),
				 new Book("Java in depth","Joshua Bloch")
};

BookCollection collection = new BookCollection("Rishabh Sharma", books);
collection.Sort();
System.out.println(collection.toString());

if(collection.hasBook( new Book("Malayalam poetry", "Akkitham Achuthan Namboodri	") )) {
	System.out.println("Book is Present");
}else {
	System.out.println("Book is not Present");
}

}
}
