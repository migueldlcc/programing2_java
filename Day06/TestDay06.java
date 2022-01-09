public class TestDay06
{
    public static final double EPSILON = 1E-14;
    public static void main(String[] args)
    {
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        double d = (13 *a) + (13 * b);
        c = c + a + b;
        c = c + a + b;
        c = c + a + b;
        c = c + a + b;
        c = c + a + b;
        c = c + a + b;
        c = c + a + b; 
        c = c + a + b; 
        c = c + a + b; 
        c = c + a + b; 
        c = c + a + b; 
        c = c + a + b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
        if (Math.abs(c - d) < EPSILON)
        {
            System.out.println("Equal");
        }

        else
        {
            System.out.println("Not equal");
        }

    }

}