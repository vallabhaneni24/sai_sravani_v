import java.util.Objects;

class Person {
    private double height;
    private double weight;
    private String ssn;
    private String phoneNumber;

    // Constructor
    public Person(double height, double weight, String ssn, String phoneNumber) {
        this.height = height;
        this.weight = weight;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Override equals method to match individuals based on ssn
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(ssn, person.ssn);
    }

    // Example usage
    public static void main(String[] args) {
        // Creating two persons with the same SSN
        Person person1 = new Person(170.0, 65.0, "123-45-6789", "555-1234");
        Person person2 = new Person(165.0, 60.0, "123-45-6789", "555-5678");

        // Comparing persons based on SSN using equals method
        if (person1.equals(person2)) {
            System.out.println("These persons are the same based on SSN.");
        } else {
            System.out.println("These persons are different.");
        }
    }
}