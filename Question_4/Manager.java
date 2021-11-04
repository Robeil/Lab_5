package Lab_5.Question_4;

public class Manager extends Employee{

    public Manager(int employeeId, String name, String department, double salary, String position) {
        super(employeeId, name, department, salary, position);
    }

    @Override
    public double addBonus() {
        return super.getSalary()+300;
    }
}
