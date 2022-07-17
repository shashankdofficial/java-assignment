package question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("1. Add Book");
		System.out.println("2. Display all book details");
		System.out.println("3. Search Book by author");
		System.out.println("4. Count number of books - by book name");
		System.out.println("5. Exit");
		System.out.println("Enter your choice:");
		
		Library library = new Library();
		
		int choice = scn.nextInt();

		if (choice == 1) {
			
			Book book = new Book();
			System.out.println("Enter the isbn no:");
			book.setIsbn(scn.nextInt());
			
			System.out.println("Enter the book name:");
			scn.nextLine();
			book.setBookName(scn.nextLine());
			
			System.out.println("Enter the author name:");
			book.setAuthor(scn.nextLine());	
			
			library.addBook(book);
			
			
		} else if (choice == 2) {
			
			
			
		} else if (choice == 3) {

		} else if (choice == 4) {

		} else if (choice == 5) {
			System.out.println("Thank You..!!");
		}

		scn.close();

	}
}
