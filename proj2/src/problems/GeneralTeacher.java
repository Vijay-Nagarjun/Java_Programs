package problems;
class Teacher {
    String name = "Mrs. Kapoor";

    void teach() {
        System.out.println("Teaching general subjects.");
    }
}

// Subclass
class SubjectTeacher extends Teacher {
    String name = "Mr. Sharma";

    @Override
    void teach() {
        super.teach();  // Call parent method
        System.out.println("Teaching Mathematics.");
    }

    void showNames() {
        System.out.println("Parent name: " + super.name); // From Teacher
        System.out.println("Child name: " + this.name);   // From SubjectTeacher
    }
}

public class GeneralTeacher {
	public static void main(String[] args) {
		SubjectTeacher teacher = new SubjectTeacher();
        teacher.teach();
        teacher.showNames();
	}
}

