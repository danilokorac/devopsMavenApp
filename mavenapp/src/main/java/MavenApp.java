import models.Employee;

public class MavenApp {
    public static void main(String[] args) {

        Employee emp = new Employee("Maven", 167, 1200);
        
        double workerSalaryCount = emp.salaryCount();

        System.out.println("Worker with name " + emp.getName() + " has salary of " + workerSalaryCount + "RSD");

    }
}
