package exercise.pay;

public class PartTimeEmployee extends Employee {

    private int hourlyWage;
    private int workHours;

    public PartTimeEmployee(String name, int id, int hourlyWage, int workHours) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.workHours = workHours;
    }

    @Override
    public void printInfo() {
        System.out.println("[" + getId() + "] " + getName());
        System.out.println("이번 달 근무 시간 : " + workHours + "시간");
    }

    @Override
    public int calculatePay() {
        return hourlyWage * workHours;
    }
}
