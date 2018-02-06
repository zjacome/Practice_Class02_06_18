
public class Book_Main {

	public static void main(String[] args) {
		
		Books book=new Books("William H. Brown",2014,300,9781338 );
		
		System.out.println("Author Name:"+book.BookAuthor+" "+"Year Published:"+book.YearPublish);
		System.out.println("Price:$"+book.Price+" "+"ISBN Number:"+book.ISBN);
		
		Books book1= new Books("Ernest Hemingway", 1920, 15, 1231234221);
		
		System.out.println("Author Name:"+book1.BookAuthor+" "+"Year Published:"+book1.YearPublish);
		System.out.println("Price:$"+book1.Price+" "+"ISBN Number:"+book1.ISBN);
	}

}
