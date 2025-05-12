//package Program3;

public class Employee extends Person{
    int empId; 
    double salary; 
 
    public Employee(String name, String dobStr, int empId, double salary) { 
        super(name, dobStr); 
        this.empId = empId; 
        this.salary = salary; 
    } 
 
    public void displayEmployeeDetails() { 
        displayPerson(); 
        System.out.println("Employee ID: " + empId); 
        System.out.println("Salary: " + salary); 
    }
}
