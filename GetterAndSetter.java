// This program explains getters and setters in Java.
// Getters and setters are methods used to access and update private fields of a class.
// They are used for encapsulation to protect data from direct access.

public class GetterAndSetter {
    public static void main(String[] args) {

        // Creating an object of the Student class
        Student student = new Student();

        // Using setter methods to set values
        student.setName("Umar");
        student.setAge(19);
        student.setGrade("A");

        // Using getter methods to get values
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student Grade: " + student.getGrade());

        System.out.println();

        // Updating values using setter
        student.setAge(20);
        System.out.println("Updated Student Age: " + student.getAge());
    }
}

// Class with private fields
class Student {
    private String name;
    private int age;
    private String grade;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for grade
    public String getGrade() {
        return grade;
    }

    // Setter for grade
    public void setGrade(String grade) {
        this.grade = grade;
    }
}
