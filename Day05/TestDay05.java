import java.util.Scanner;

public class TestDay05 
{
    public static void main(String[] args)
    {
        
        Scanner in = new Scanner (System.in);// creates a scanner variable which is "in"
        System.out.println(in.nextLine());
        if (in.hasNextInt())
        {
            int value = in.nextInt(); //This actually gets the input
            System.out.printf("The input was %5.2f\n", (double) value); 
        }
       
    }
}