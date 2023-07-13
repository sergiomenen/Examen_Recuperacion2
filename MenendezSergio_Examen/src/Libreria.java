
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class User {
    private String name;
    private String lastName;
    private Date dateOfBirth;
    private String dni;
    private CreditCardInfo creditCardInfo;

    public User(String name, String lastName, Date dateOfBirth, String dni, CreditCardInfo creditCardInfo) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dni = dni;
        this.creditCardInfo = creditCardInfo;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDni() {
        return dni;
    }

    public CreditCardInfo getCreditCardInfo() {
        return creditCardInfo;
    }

    public boolean isAuthorized() {
        // Lógica para verificar si el usuario está autorizado
        return true;
    }
}

class ParentUser {
    private User childUser;

    public ParentUser(User childUser) {
        this.childUser = childUser;
    }

    public User getChildUser() {
        return childUser;
    }
}

class Product {
    private String title;
    private double price;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

class Book extends Product {
    private String author;
    private String identifier;
    private String category;
    private String condition;

    public Book(String title, String author, String identifier, double price, String category, String condition) {
        super(title, price);
        this.author = author;
        this.identifier = identifier;
        this.category = category;
        this.condition = condition;
    }

    public String getAuthor() {
        return author;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getCategory() {
        return category;
    }

    public String getCondition() {
        return condition;
    }
}

class BoardGame extends Product {
    private int recommendedAge;
    private String theme;

    public BoardGame(String title, double price, int recommendedAge, String theme) {
        super(title, price);
        this.recommendedAge = recommendedAge;
        this.theme = theme;
    }

    public int getRecommendedAge() {
        return recommendedAge;
    }

    public String getTheme() {
        return theme;
    }
}

class CreditCardInfo {
    private String cardNumber;
    private Date expirationDate;
    private String cvv;

    public CreditCardInfo(String cardNumber, Date expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public String getCvv() {
        return cvv;
    }
}

class Sale {
    private User user;
    private Product product;
    private Date date;

    public Sale(User user, Product product) {
        this.user = user;
        this.product = product;
        this.date = new Date();
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public Date getDate() {
        return date;
    }
}

class LibraryManagementSystem {
    private List<User> users;
    private List<Book> books;
    private List<BoardGame> games;
    private List<Sale> sales;

    public LibraryManagementSystem() {
        users = new ArrayList<>();
        books = new ArrayList<>();
        games = new ArrayList<>();
        sales = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addGame(BoardGame game) {
        games.add(game);
    }

    public void removeGame(BoardGame game) {
        games.remove(game);
    }

    public void sellProduct(User user, Product product) {
        Sale sale = new Sale(user, product);
        sales.add(sale);
    }

    public void returnProduct(User user, Product product) {
        // Lógica para procesar la devolución de un producto
    }

    public List<Product> getProductsByTitle(String title) {
        // Lógica para buscar productos por título
        return new ArrayList<>();
    }

    public List<Product> getSoldProducts() {
        // Lógica para obtener los productos vendidos
        return new ArrayList<>();
    }

    public double getTotalBookSales(int month, int year) {
        // Lógica para obtener el dinero ingresado por ventas de libros en un mes/año determinado
        return 0.0;
    }

    public double getTotalGameSales(int month, int year) {
        // Lógica para obtener el dinero ingresado por ventas de juegos en un mes/año determinado
        return 0.0;
    }

    public int getTotalBookSalesCount(int month, int year) {
        // Lógica para obtener la cantidad de libros vendidos en un mes/año determinado
        return 0;
    }

    public int getTotalGameSalesCount(int month, int year) {
        // Lógica para obtener la cantidad de juegos de mesa vendidos en un mes/año determinado
        return 0;
    }

    public List<Book> getBookRankingByTitle(int month, int year) {
        // Lógica para obtener el ranking por título de libros vendidos en un mes/año determinado
        return new ArrayList<>();
    }

    public List<BoardGame> getGameRankingByTitle(int month, int year) {
        // Lógica para obtener el ranking por título de juegos de mesa vendidos en un mes/año determinado
        return new ArrayList<>();
    }

    public List<User> getTopCustomersByPurchaseCount(int month, int year, int limit) {
        // Lógica para obtener el listado de los N clientes con más compras en un mes/año determinado
        return new ArrayList<>();
    }
}
