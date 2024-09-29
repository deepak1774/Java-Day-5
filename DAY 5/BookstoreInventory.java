import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;
    private int copies;

    public Book(String title, String author, double price, int copies) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.copies = copies;
    }
    public static Book getDetailsFromUser(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter number of copies: ");
        int copies = scanner.nextInt();
        scanner.nextLine();  
        return new Book(title, author, price, copies);
    }
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
        System.out.println("Number of Copies: " + copies);
    }
}
public class BookstoreInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            books[i] = Book.getDetailsFromUser(scanner);
        }
        System.out.println("\nBooks in the inventory:");
        for (Book book : books) {
            book.displayDetails();
            System.out.println();  
        }
        scanner.close();
    }
}