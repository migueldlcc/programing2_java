/**
 * A class that prints the employee's name, current slary, and raised salary
 * @author: Miguel de la Cruz Cabello
 * @version: 02/28/2020
 */
public class EmployeeTester
{
    public static void main(String[] args)
    {
        Employee miguel = new Employee("Miguel de la Cruz", 2000);
        System.out.println("Employee1: " + miguel.getName() + "; Initial Salary: $" + miguel.getSalary());
        miguel.raiseSalary(5);
        System.out.println("Employee1: " + miguel.getName() + "; Salary raised 6th month: $" + miguel.getSalary());
        miguel.raiseSalary(10);
        System.out.println("Employee1: " + miguel.getName() + "; Salary raised 7th month: $" + miguel.getSalary());
        System.out.println();

        Employee john = new Employee("John Smith", 900);
        System.out.println("Employee2: " + john.getName() + "; Initial Salary: $" + john.getSalary());
        john.raiseSalary(3);
        System.out.println("Employee2: " + john.getName() + "; Salary raised 2nd month: $" + john.getSalary());
        john.raiseSalary(6);
        System.out.println("Employee2: " + john.getName() + "; Salary raised 3rd month: $" + john.getSalary());
        System.out.println();

        Employee peter = new Employee("Peter McArthur", 6000);
        System.out.println("Employee3: " + peter.getName() + "; Initial Salary: $" + peter.getSalary());
        peter.raiseSalary(20);
        System.out.println("Employee3: " + peter.getName() + "; Salary raised  3rd year: $" + peter.getSalary());
        peter.raiseSalary(27);
        System.out.println("Employee3: " + peter.getName() + "; Salary raised 5th year: $" + peter.getSalary());
    }
}