import java.util.ArrayList;

/**
 * A class that cumputes the average surface area of an array of soda cans. 
 * This was exercise P9.14 from Big Java: Late Objects. 
 * NOTE: I look at the average method in the book on page 451, but I changed for the ArrayList.
 * @author: Miguel de la Cruz Cabello
 * @version: 03/23/2020 
 */
public class SodaCanTester
{
    public static void main(String[] args)

    {
       SodaCan SodaCan1 = new SodaCan(4, 2); 
       SodaCan SodaCan2 = new SodaCan(3, 6);
       SodaCan SodaCan3 = new SodaCan(8,3);
       SodaCan SodaCan4 = new SodaCan(5,8);
       SodaCan SodaCan5 = new SodaCan(3, 1);
       ArrayList<SodaCan> arr = new ArrayList<SodaCan>(); 
       arr.add(SodaCan1);
       arr.add(SodaCan2); 
       arr.add(SodaCan3);
       arr.add(SodaCan4);
       arr.add(SodaCan5);
       
       System.out.println("Can1 " + SodaCan1.toString());
       System.out.println("Can2 " + SodaCan2.toString());
       System.out.println("Can3 " + SodaCan3.toString());
       System.out.println("Can4 " + SodaCan4.toString());
       System.out.println("Can5 " + SodaCan5.toString());
       
       if (SodaCan1.equals(SodaCan2))
       {
           System.out.println("Equal");
       }
       else
       {
           System.out.println("Not equal");
       }
       System.out.printf("Average surface area: %.2f", average(arr));
    }

      /**
       * A class that computes the average of the measures of the given cans
       * 
       * @param arr array of Measurable objects
       * @return the average of the measures
       */
      public static double average(ArrayList<SodaCan> arr) 
      {
        double sum = 0;
        for (SodaCan obj : arr) 
        {
            sum = sum + obj.getMeasure();
        }
        return sum / arr.size();
    }

   
}