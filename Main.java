

// Малинин Андрей

public class Main {
    public static void main(String[] args) {
        // Создаем несколько товаров
        Product product1 = new Product("Товар1", 100.0, 5);
        Product product2 = new Product("Товар2", 200.0, 4);
        Product product3 = new Product("Товар3", 150.0, 3);

        // Создаем категории и добавляем товары
        ProductCategory category1 = new ProductCategory("Категория1");
        category1.addProduct(product1);
        category1.addProduct(product2);

        ProductCategory category2 = new ProductCategory("Категория2");
        category2.addProduct(product2);
        category2.addProduct(product3);

        // Выводим на консоль каталог продуктов
        System.out.println("Каталог продуктов:");
        System.out.println(category1.getName() + ":");
        for (Product product : category1.getProducts()) {
            System.out.println(product);
        }
        System.out.println(category2.getName() + ":");
        for (Product product : category2.getProducts()) {
            System.out.println(product);
        }

        // Создаем пользователей и добавляем продукты в корзину
        User user1 = new User("user1", "password1");
        user1.addToBasket(product1);

        User user2 = new User("user2", "password2");
        user2.addToBasket(product2);
        user2.addToBasket(product3);

        // Выводим на консоль покупки посетителей магазина
        System.out.println("Покупки посетителей магазина:");
        System.out.println(user1.getUsername() + " - " + user1.getBasket().getProducts());
        System.out.println(user2.getUsername() + " - " + user2.getBasket().getProducts());
    }
}