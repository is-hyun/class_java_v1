package exercise.pay;

public class FullTimeEmployee extends Employee {

    private int monthlySalary;

    public FullTimeEmployee(String name, int id, int monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void printInfo() {
        System.out.println("[" + getId() + "] " + getName());
    }

    @Override
    public int calculatePay() {
        return monthlySalary;
    }
}
