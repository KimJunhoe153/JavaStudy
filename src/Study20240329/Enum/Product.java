package Study20240329.Enum;

public class Product {
    private String name;
    private double price;
    private Category cartegory;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCartegory() {
        return cartegory;
    }

    public void setCartegory(Category cartegory) {
        this.cartegory = cartegory;
    }

    public Product(String name, double price, Category cartegory) {
        this.name = name;
        this.price = price;
        this.cartegory = cartegory;
    }
}
