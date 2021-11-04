package Lab_5.Question_4;

public class Clerk extends Employee{

    public Clerk(int employeeId, String name, String department, double salary, String position) {
        super(employeeId, name, department, salary, position);
    }

    @Override
    public double addBonus() {
        return super.addBonus() + 100;
    }
}
