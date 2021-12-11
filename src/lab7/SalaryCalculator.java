package lab7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        int quantityCEO;
        int quantityManager;
        int quantityStandardEmployee;
        List<CEO> listCEO;
        List<Manager> listManager;
        List<StandardEmployee> listStandardEmployee;

        // Input CEO
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantity of CEO: ");
        quantityCEO = scanner.nextInt();
        listCEO = new ArrayList<>();
        SalaryCalculator.inputMember(EmployeeType.CEO, listCEO, quantityCEO);

        // Input Manager
        System.out.print("Quantity of Manager: ");
        quantityManager = scanner.nextInt();
        listManager = new ArrayList<>();
        SalaryCalculator.inputMember(EmployeeType.MANAGER, listManager, quantityManager);

        // Input StandardEmployee
        System.out.print("Quantity of Standard Employee: ");
        quantityStandardEmployee = scanner.nextInt();
        listStandardEmployee = new ArrayList<>();
        SalaryCalculator.inputMember(EmployeeType.STANDARD, listStandardEmployee, quantityStandardEmployee);

        // Calculator Salaries
        double CEOSalaries = calculateCEOSalaries(listCEO);
        double managerSalaries = calculateManagerSalaries(listManager);
        double standardEmployeeSalaries = calculateStandardEmpSalaries(listStandardEmployee);
        double totalSalaries = totalSalaries(CEOSalaries, managerSalaries, standardEmployeeSalaries);
        System.out.println("Total salaries: " + totalSalaries);

        // Update salary
        System.out.println("\nWhich employee's type do you want to update? 1. CEO   2. Manager  3. Standard Employee    4. None");
        System.out.print("\tType: ");
        int employeeType = scanner.nextInt();
        String name;
        boolean updateFlag;

        switch (employeeType) {
            case 1:
                System.out.print("CEO's name: ");
                name = scanner.next();
                updateFlag = UpdateListCEO(listCEO, name);
                if (updateFlag) {
                    CEOSalaries = calculateCEOSalaries(listCEO);
                    totalSalaries = totalSalaries(CEOSalaries, managerSalaries, standardEmployeeSalaries);
                    System.out.println("Total salaries: " + totalSalaries);
                } else {
                    System.out.println("Doesn't have employee name in list!");
                }
                break;
            case 2:
                System.out.print("Manager's name: ");
                name = scanner.next();
                updateFlag = UpdateListManager(listManager, name);
                if (updateFlag) {
                    managerSalaries = calculateManagerSalaries(listManager);
                    totalSalaries = totalSalaries(CEOSalaries, managerSalaries, standardEmployeeSalaries);
                    System.out.println("Total salaries: " + totalSalaries);
                } else {
                    System.out.println("Doesn't have employee name in list!");
                }
                break;
            case 3:
                System.out.print("Standard employee's name: ");
                name = scanner.next();
                updateFlag = UpdateListStandardEmp(listStandardEmployee, name);
                if (updateFlag) {
                    standardEmployeeSalaries = calculateStandardEmpSalaries(listStandardEmployee);
                    totalSalaries = totalSalaries(CEOSalaries, managerSalaries, standardEmployeeSalaries);
                    System.out.println("Total salaries: " + totalSalaries);
                } else {
                    System.out.println("Doesn't have employee name in list!");
                }
                break;
            default:
                System.out.println("Have a nice day!");
        }

    }

    public static void inputMember(EmployeeType employeeType, List listMember, int totalMember) {
        int currentMember = 0;
        Scanner scanner = new Scanner(System.in);
        while (currentMember < totalMember) {
            System.out.println("Input " + employeeType + " " + (currentMember + 1) + ": ");
            System.out.print("\tName: ");
            String name = scanner.next();
            System.out.print("\tSalary: ");
            double salary = scanner.nextDouble();
            System.out.print("\tSupport salary: ");
            double supportSalary = scanner.nextDouble();

            switch (employeeType) {
                case CEO:
                    CEO tempCEO = new CEO(name, salary, supportSalary);
                    listMember.add(tempCEO);
                    currentMember++;
                    break;
                case MANAGER:
                    Manager tempManager = new Manager(name, salary, supportSalary);
                    listMember.add(tempManager);
                    currentMember++;
                    break;
                case STANDARD:
                    StandardEmployee tempStandardEmployee = new StandardEmployee(name, salary, supportSalary);
                    listMember.add(tempStandardEmployee);
                    currentMember++;
                    break;
            }
        }
    }

    private static double calculateCEOSalaries(List<CEO> listCEO) {
        double totalSalaries = 0;

        for (CEO ceo : listCEO) {
            double monthlyEmpSalary = ceo.getSalary() + ceo.getSupportSalary();
            totalSalaries += monthlyEmpSalary;
        }

        return totalSalaries;
    }

    private static double calculateManagerSalaries(List<Manager> listManager) {
        double totalSalaries = 0;

        for (Manager mng : listManager) {
            double monthlyEmpSalary = mng.getSalary() + mng.getSupportSalary();
            totalSalaries += monthlyEmpSalary;
        }

        return totalSalaries;
    }

    private static double calculateStandardEmpSalaries(List<StandardEmployee> listStandardEmployee) {
        double totalSalaries = 0;

        for (StandardEmployee employee : listStandardEmployee) {
            double monthlyEmpSalary = employee.getSalary() + employee.getSupportSalary();
            totalSalaries += monthlyEmpSalary;
        }

        return totalSalaries;
    }

    public static double totalSalaries (double CEOSalaries, double managerSalaries, double standardEmployeeSalaries){
        return CEOSalaries + managerSalaries + standardEmployeeSalaries;
    }

    private static boolean UpdateListCEO(List<CEO> listCEO, String name) {
        for (CEO ceo : listCEO) {
            if (ceo.getName().equals(name)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Updating " + name + "'s information: ");
                System.out.print("\tSalary: ");
                ceo.setSalary(scanner.nextDouble());
                System.out.print("\tSupport salary: ");
                ceo.setSupportSalary(scanner.nextDouble());
                return true;
            }
        }
        return false;
    }

    private static boolean UpdateListManager(List<Manager> listManager, String name) {
        for (Manager mng : listManager) {
            if (mng.getName().equals(name)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Updating " + name + "'s information: ");
                System.out.print("\tSalary: ");
                mng.setSalary(scanner.nextDouble());
                System.out.print("\tSupport salary: ");
                mng.setSupportSalary(scanner.nextDouble());
                return true;
            }
        }
        return false;
    }

    private static boolean UpdateListStandardEmp(List<StandardEmployee> listStandardEmployee, String name) {
        for (StandardEmployee emp : listStandardEmployee) {
            if (emp.getName().equals(name)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Updating " + name + "'s information: ");
                System.out.print("\tSalary: ");
                emp.setSalary(scanner.nextDouble());
                System.out.print("\tSupport salary: ");
                emp.setSupportSalary(scanner.nextDouble());
                return true;
            }
        }
        return false;
    }
}
