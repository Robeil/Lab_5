package CS203Course.Lab_5.Question_4;

public class Employee implements Comparable<Employee> {

    private int employeeId;
    private String name;
    private String department;
    private double salary;
    private String position;

    public Employee(int employeeId, String name, String department, double salary, String position) {
        super();
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.position = position;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double addBonus() {
        return this.salary + 200;
    }

    public void printEmployeeDetails() {
        System.out.println("\nName: " + name
                + ", department: " + department
                + ", employee ID: " + employeeId
                + ", salary and bonus: " + addBonus()
        );
    }

    @Override
    public int compareTo(Employee o) { //fixme ==> implement HERE
        if (!(o instanceof Employee)) return -1;
        return position.compareTo(o.position);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Employee)) return false;
        Employee e = (Employee) obj;
        return position.equals(e.position);
    }
}
