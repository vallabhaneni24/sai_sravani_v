public class Product {
    private double price;

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Overloaded getter method that takes quantity as a parameter
    public double getPrice(int quantity) {
        // Assuming the price is for a single quantity, multiply by the quantity
        return price * quantity;
    }

    // Example of usage
    public static void main(String[] args) {
        // Create an instance of the Product class
        Product laptop = new Product();

        // Set the price for a single quantity
        laptop.setPrice(1000.0);

        // Get the price for a single quantity
        System.out.println("Price for a single laptop: $" + laptop.getPrice());

        // Get the price for a specific quantity (e.g., 3 laptops)
        System.out.println("Price for 3 laptops: $" + laptop.getPrice(3));
    }
}