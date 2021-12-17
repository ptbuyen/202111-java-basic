package lab9_1;

public class Manager extends Employee {

    private static final double startSalary = 50;
    private static final double startSupportSalary = 3;

    public Manager(double salary, double supportSalary) {
        super(salary, supportSalary);
    }

    public Manager() {
        super(startSalary, startSupportSalary);
    }
}
