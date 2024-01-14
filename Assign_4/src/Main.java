// Main.java
public class Main {
    public static void main(String[] args) {
        // Example usage
        Vehicle vehicleInstance = new Vehicle("Toyota");
        Car carInstance = new Car("Honda", 4);
        Car carInstanceWithDefault = new Car(2);

        // Print values
        System.out.println(vehicleInstance.brand);
        System.out.println(carInstance.brand);
        System.out.println(carInstance.getNumberOfDoors());
        System.out.println(carInstanceWithDefault.brand);
        System.out.println(carInstanceWithDefault.getNumberOfDoors());
    }
}