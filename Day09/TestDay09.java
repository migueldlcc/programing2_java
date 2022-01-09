public class TestDay09
{
    public static void main(String[] args)
    {
        double a = 4.2;
        double b = 6.8;


        double c = sum(a, b);
        System.out.println(c);
    }
    /**
     * Method level comment. Comes *before* the method signature.
     * Have one of these Javadoc comments on every method you turn in. (Except main)
     * @param a the first number 
     * @param b the second number
     * @return the sume of the numbers
     */

    public static double sum(double a, double b)
    {
        return a + b;
    }
}

