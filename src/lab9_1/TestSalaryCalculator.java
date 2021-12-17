package lab9_1;

    //Salary calculator by using inheritance

import java.util.ArrayList;
import java.util.List;

public class TestSalaryCalculator {
    public static void main(String[] args) {
        CEO ceo = new CEO();
        Manager manager = new Manager();
        StandardEmployee standardEmployee = new StandardEmployee();

        List<Employee> employeeList = new ArrayList<>();
        // Add 1 CEO
        employeeList.add(ceo);
        // Add 2 Manager
        for (int i = 0; i < 2; i++) {
            employeeList.add(manager);
        }
        // Add 7 Standard Employee
        for (int i = 0; i < 7; i++) {
            employeeList.add(standardEmployee);
        }

        // Calculator Total Salaries
        double totalSalary = SalaryCalculator.totalSalary(employeeList);
        System.out.println("Total Salaries: " + totalSalary);
    }
}
