// Subclass extending Department
public class SubDepartment extends Department {
    private int departmentSize;

    // Constructor to initialize departmentSize
    public SubDepartment(int departmentSize) {
        this.departmentSize = departmentSize;
    }

    // Implementation of the abstract method
    @Override
    public int getDepartmentSize() {
        return departmentSize;
    }

    // Additional methods or attributes specific to the subclass can be added here

    // Main method for testing
    public static void main(String[] args) {
        // Create an instance of SubDepartment
        SubDepartment subDepartment = new SubDepartment(10);

        // Print the department size
        System.out.println("Department Size: " + subDepartment.getDepartmentSize());
    }
}
