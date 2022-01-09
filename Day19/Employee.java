/**
 * A class that shows a employee name, his current salary, and raise his salary
 * @author: Miguel de la Cruz Cabello
 * @version: 02/28/2020
 */
public class Employee
{
    private int currentSalary;
    private String employeeName;

    public Employee(String employeeName, int currentSalary)
    {
        this.employeeName = employeeName;
        this.currentSalary = currentSalary;
    }

    /**
     * Raises the salary of the employee by a chosen percentage
     * @param salaryIncrease
     */
    public void raiseSalary(int salaryIncrease)
    {
        currentSalary = currentSalary + (currentSalary * salaryIncrease / 100);
    }

      /**
     * Gets the name of the employee
     * @return: name of employee
     */
    public String getName()
    {
        return employeeName;
    }

    /**
     * Gets the current salary
     * @return: the current salary
     */
    public int getSalary()
    {
        return currentSalary;
    }
}