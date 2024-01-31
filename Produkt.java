import java.util.ArrayList;

class Product {
    private String name;
    private double price;
    private int rating;

    public Product(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", rating=" + rating + "}";
    }
}

class ProductCategory {
    private String name;
    private ArrayList<Product> products;

    public ProductCategory(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "ProductCategory{name='" + name + "', products=" + products + "}";
    }
}

class Basket {
    private ArrayList<Product> products;

    public Basket() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Basket{products=" + products + "}";
    }
}

class User {
    private String username;
    private Basket basket;

    public User(String username, String password) {
        this.username = username;
        this.basket = new Basket();
    }

    public void addToBasket(Product product) {
        this.basket.addProduct(product);
    }

    public String getUsername() {
        return username;
    }

    public Basket getBasket() {
        return basket;
    }

    @Override
    public String toString() {
        return "User{username='" + username + "', basket=" + basket + "}";
    }
}