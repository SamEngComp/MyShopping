package Domain;

public class Product implements Comparable<Product> {

    // PROPERTIES

    private String name;
    private double price;

    // CONSTRUCTOR

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Product:  %s price: $ %.2f", this.name, this.price);
    }

    @Override
    public int compareTo(Product otherProduct) {
        return this.getName().compareTo(otherProduct.getName());
    }

    // GET

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
