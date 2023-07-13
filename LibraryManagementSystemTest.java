import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

class LibraryManagementSystemTest {
    private LibraryManagementSystem library;

    @BeforeEach
    void setUp() {
        library = new LibraryManagementSystem();
    }

    @Test
    void testSellProduct() {
        User user = new User("John", "Doe", new Date(), "123456789", new CreditCardInfo("1234567890123456", new Date(), "123"));
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9781234567890", 19.99, "Novel", "New");

        library.addUser(user);
        library.addBook(book);

        library.sellProduct(user, book);

        List<Product> soldProducts = library.getSoldProducts();

        Assertions.assertEquals(1, soldProducts.size());
        Assertions.assertEquals(book, soldProducts.get(0));
    }

    @Test
    void testReturnProduct() {
        User user = new User("John", "Doe", new Date(), "123456789", new CreditCardInfo("1234567890123456", new Date(), "123"));
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9781234567890", 19.99, "Novel", "New");

        library.addUser(user);
        library.addBook(book);

        library.sellProduct(user, book);
        library.returnProduct(user, book);

        List<Product> soldProducts = library.getSoldProducts();

        Assertions.assertEquals(0, soldProducts.size());
    }

    @Test
    void testGetProductsByTitle() {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9781234567890", 19.99, "Novel", "New");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9789876543210", 14.99, "Novel", "New");
        Book book3 = new Book("1984", "George Orwell", "9785678912345", 9.99, "Dystopian", "Used");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        List<Product> products = library.getProductsByTitle("To Kill a Mockingbird");

        Assertions.assertEquals(1, products.size());
        Assertions.assertEquals(book2, products.get(0));
    }

    // Agrega más pruebas según sea necesario para las demás funcionalidades

}
