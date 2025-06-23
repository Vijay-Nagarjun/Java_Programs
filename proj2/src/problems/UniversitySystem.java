package problems;
class Person {
    // Constructor
    Person(String name) {
        System.out.println("Person Name: " + name);
    }
}

// Subclass
class Student extends Person {
    // Constructor
    Student(String name, String course) {
        super(name); // Call parent constructor
        System.out.println("Course Enrolled: " + course);
    }
}
public class UniversitySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student student = new Student("Rahul", "Computer Science");
	}

}
