package lab7;

public class CEO {

    private String name;
    private double salary;
    private double supportSalary;

    public CEO(String name, double salary, double supportSalary) {
        this.name = name;
        this.salary = salary;
        this.supportSalary = supportSalary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSupportSalary() {
        return supportSalary;
    }

    public void setSupportSalary(double supportSalary) {
        this.supportSalary = supportSalary;
    }
}
