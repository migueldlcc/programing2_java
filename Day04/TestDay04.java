import java.util.Scanner;

public class TestDay04 
{
    public static void main(String[] args)
    {
        int num = 15;
        int other = 7;
        // order of operations matters
        double result =  num / (double) other;
        System.out.println(result);
        
        Scanner in = new Scanner (System.in);// creates a scanner variable which is "in"
        int value = in.nextInt(); //This actually gets the input
        System.out.println(value * 2);    
    }
}