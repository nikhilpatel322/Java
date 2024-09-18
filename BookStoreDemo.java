class Book {
    private String title;
    private String author;
    private double price;
    private int quantity;

    public Book(String title, String author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public void purchaseBook(int quantityToPurchase) {
        if (quantityToPurchase > quantity) {
            System.out.println("Sorry, not enough stock available. Only " + quantity + " copies in stock.");
        } else {
            quantity -= quantityToPurchase;
            System.out.println(quantityToPurchase + " copies of '" + title + "' purchased successfully.");
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Quantity in stock: " + quantity);
    }

    public String getTitle() {
        return title;
    }
}
class Customer {
    private String name;
    public Customer(String name) {
        this.name = name;
    }
    public void purchaseBook(Book book, int quantity) {
        System.out.println(name + " is purchasing " + quantity + " copies of '" + book.getTitle() + "'.");
        book.purchaseBook(quantity);
    }
}
public class BookStoreDemo {
    public static void main(String[] args) {
        // Creating a book
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99, 5);
        Customer customer = new Customer("John Doe");
        System.out.println("Book details before purchase:");
        book1.displayDetails();
        customer.purchaseBook(book1, 3);

        System.out.println("\nBook details after purchase:");
        book1.displayDetails();
    }
}
