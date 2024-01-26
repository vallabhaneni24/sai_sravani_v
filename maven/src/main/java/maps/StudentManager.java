package maps;
import java.util.HashMap;

public class StudentManager {
    public static void main(String[] args) {
        // Create HashMap to store students
        HashMap<String, Student> studentMap = new HashMap<>();

        // Add some student objects to the HashMap
        studentMap.put("John", new Student("John", "Doe", 3.8));
        studentMap.put("Alice", new Student("Alice", "Smith", 3.9));
        studentMap.put("Bob", new Student("Bob", "Johnson", 3.5));
        studentMap.put("Emma", new Student("Emma", "Brown", 4.0));
        studentMap.put("Michael", new Student("Michael", "Wilson", 3.7));

        // Call the method to get a student by name
        String searchName = "Bob";
        Student foundStudent = getStudentByName(studentMap, searchName);

        if (foundStudent != null) {
            System.out.println("Found student: " + foundStudent);
        } else {
            System.out.println("Student with name " + searchName + " not found.");
        }
    }

    // Method to get student by name from HashMap
    public static Student getStudentByName(HashMap<String, Student> studentMap, String firstName) {
        // Check if the student with given name exists in the HashMap
        if (studentMap.containsKey(firstName)) {
            // Return the Student object corresponding to the given name
            return studentMap.get(firstName);
        } else {
            // Return null if student not found
            return null;
        }
    }
}