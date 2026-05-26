package Assignments.Day1;

public class Book {
		String title;
		String author;
		double price;
		void displayBook() {
			System.out.println("Title : " + title);
			System.out.println("Author : " + author);
			System.out.println("Price : " + price);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book();
		b.title="Wings of Fire";
		b.author="A.P.J.Abdul Kalam";
		b.price=250.50;
		b.displayBook();
	}

}
