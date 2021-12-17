package lab9_1;

import java.util.List;

public class SalaryCalculator {

    public static double totalSalary (List<Employee> employeeList){
        double totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary() + employee.getSupportSalary();
        }
        return totalSalary;
    }
}
