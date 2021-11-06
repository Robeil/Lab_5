package CS203Course.Lab_5.Question_4;

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

        System.out.println("This should be false " +emp1.equals(emp2));
        System.out.println("This should be false " +emp1.equals(emp3));
        System.out.println("This should be true " +emp1.equals(emp1));

        Employee clerk = new Clerk(01,"New Clerk","stoking",23,"front");

        clerk.printEmployeeDetails();

    }
}
