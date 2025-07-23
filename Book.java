//Make a constructor for a Book class that initializes title, author, and price.

import java.util.*;

class Book{
	String title;
	String author;
	double price;
	
	Book(String t, String a, double p){
		this.title=t;
		this.author=a;
		this.price=p;
	}
	
	String getTitle(){
		return title;
	}
	
	String getAuthor(){
		return author;
	}
	
	double getPrice(){
		return price;
	}
	
	public static void main(String[] args){
		Book book = new Book("Fragments of a warrior","Banuja Vijayarajan",999.99);
		
		System.out.println("The title is : "+book.getTitle());
		System.out.println("The author is : "+book.getAuthor());
		System.out.println("The price is : "+book.getPrice());
	}
} 

/*  getting user input and printing it:-

class Book{
	String title;
	String author;
	double price;
	
	void displayDetails(){
		System.out.println("Book's name: "+title);
		System.out.println("Author's name: "+author);
		System.out.println("Book's price: "+price);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Book book = new Book();
		
		System.out.println("Enter the book's name: ");
		book.title = sc.nextLine();
		
		System.out.println("Enter the author's name: ");
		book.author = sc.nextLine();
		
		System.out.println("Enter the price of the book: ");
		book.price = sc.nextDouble();
		
		book.displayDetails();
	}
} */

