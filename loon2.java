class Student {
    // Step 1: Attributes
    String name;
    int age;
    String course;

    // Step 1: Method to display details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println(); // Adds a blank line for readability
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Student Information");
        System.out.println("-------------------");

        // Step 2: Create first Student object
        Student student1 = new Student();
        student1.name = "Christopher Loon";
        student1.age = 19;
        student1.course = "BSIT";

        // Step 2: Create second Student object
        Student student2 = new Student();
        student2.name = "Jackes cleavan Tubil";
        student2.age = 19;
        student2.course = "BSBA";

        // Step 2: Call displayInfo for each object
        student1.displayInfo();
        student2.displayInfo();
    }
}