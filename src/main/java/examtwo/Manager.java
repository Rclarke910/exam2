package examtwo;

public class Manager extends Employee{
    final double EXTRA_DISCOUNT = 0.05;

    private double salary;

    public Manager(String name, Size size, double salary) {
        super(name, size);
        this.salary = salary;

    }
}
