package Lab_5.Question_4;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee emp1 = new Clerk(11, "Robeil", "Engineering", 12000000, "Software engineer");
        Employee emp2 = new Clerk(22, "Meron", "Engineering", 10000000, "Frontend Engineer");
        Employee emp3 = new Clerk(11, "Keleab", "IT specialist", 8000000, "IT specialist");
        Employee emp4 = new Clerk(11, "Haben", "Google", 12000000, "Manager");

        emp1.printEmployeeDetails();
        emp2.printEmployeeDetails();
        emp3.printEmployeeDetails();
        emp4.printEmployeeDetails();

    }
}
