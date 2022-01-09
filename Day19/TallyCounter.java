public class TallyCounter
{
    // Instance variables
    // Defines a variable with a type and name
    private int value;
    // Every instance wariable wil be "private"
    // Private things cannot be sen by users of the class
    // Public things can....

    // Constructor
    // It is a special method that *sets up the instance variables*
    // We will always have a constructor
    // The constructor always has a capital letter at the start, because its name always matches the class name
    public TallyCounter()
    {
        // Set up the variable(s)
        value = 0;
        // Do not type "int value = 0"
    }

    // Instance methods
    
    /**
     * Increments the counter by 1
     */
    public void count()
    {
        value++;
    }

    /**
     * Resets the value to 0
     */
    public void reset()
    {
        value = 0;
    }

    /**
     * Get the current value of the count
     * 
     * @return: the current value
     */
    public int getValue()
    {
        return value;
    }

}