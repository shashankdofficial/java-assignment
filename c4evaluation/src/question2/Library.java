package question2;
import java.util.List;
import java.util.ArrayList;

public class Library {

	List<Book> libraryBooks = new ArrayList<>();

	void addBook(Book book) {

		libraryBooks.add(book);
		System.out.println("Book added successfully");

	};

	boolean isEmpty() {

		return libraryBooks.isEmpty();
	}

	List<Book> viewAllBooks() {

		return libraryBooks;
	}

	List<Book> viewBooksByAuthor(String author) {
		
		List<Book> books = new ArrayList<>();
		
		for(Book x : libraryBooks) {
			
			if(x.getAuthor().equals(author)) {
				books.add(x);
			}
		}
		
		return books;
	}

	int countNoOfBook(String bname) {

		return 0;
	}
}
