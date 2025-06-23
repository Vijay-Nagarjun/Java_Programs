package problems;
class Employee {
    // Method in the superclass
    void calculateSalary() {
        System.out.println("Calculating base salary...");
    }
}

// Subclass FullTimeEmployee, which overrides calculateSalary() method
class FullTimeEmployee extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Calculating full-time salary with benefits...");
    }
}

// Subclass PartTimeEmployee, which overrides calculateSalary() method
class PartTimeEmployee extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Calculating part-time salary based on hours...");
    }
}
public class EmployeeSalaryCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee fullTimeEmp = new FullTimeEmployee();
        Employee partTimeEmp = new PartTimeEmployee();

        // Calling calculateSalary() method on both references
        fullTimeEmp.calculateSalary();  // Output: Calculating full-time salary with benefits...
        partTimeEmp.calculateSalary();

	}

}
