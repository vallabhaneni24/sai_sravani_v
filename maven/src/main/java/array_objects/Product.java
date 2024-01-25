package array_objects;

public class Product implements Comparable<Product> {
    private int id;
    private double weight;
    private double price;

    // Constructors

    public Product(int id, double weight, double price) {
        this.id = id;
        this.weight = weight;
        this.price = price;
    }

    // Getters and Setters (omitted for brevity)

    // Implementing compareTo method from Comparable interface
    @Override
    public int compareTo(Product otherProduct) {
        // Compare products based on their price
        return Double.compare(this.price, otherProduct.price);
    }

    // toString method (optional, for better representation)
    @Override
    public String toString() {
        return "Product{id=" + id + ", weight=" + weight + ", price=" + price + '}';
    }

    // Example usage
    public static void main(String[] args) {
        // Creating products
        Product product1 = new Product(1, 0.5, 25.99);
        Product product2 = new Product(2, 0.8, 19.99);
        Product product3 = new Product(3, 0.3, 29.99);

        // Comparing products based on price
        int result = product1.compareTo(product2);

        // Output the comparison result
        if (result < 0) {
            System.out.println(product1 + " is cheaper than " + product2);
        } else if (result > 0) {
            System.out.println(product1 + " is more expensive than " + product2);
        } else {
            System.out.println(product1 + " and " + product2 + " have the same price");
        }
    }
}