package oops;
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student student = new Student("Sai Sravani");
        System.out.println("Student name: " + student.getName());
    }
}