/**
 *  A class that calculates the volume and surface area of a can
 * @author: Miguel de la Cruz Cabello
 * @version: 03/20/2020
 */
public class SodaCan
{

    private double height;
    private double radius;
    private double average;

    /**
     * A class that shows the radius ans the height of the can
     * @param height height of the can
     * @param radius radius of the can
     */
    public SodaCan(double height, double radius)
    {
        this.height = height;
        this.radius = radius;
    }

    /**
    * A class that gets the surface area of a can (Cylinder)
    * @return the surface area of the can
    */ 
   public double getMeasure()
   {
       average =  (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
       return average;
   }

   /**
    * A class that computes the volume of the can
    * @return volume of the can
    */
   public double getVolume()
   {
       return Math.PI * radius * radius * height;
   }

    /**
     *  * A class that returns a string representation for each object
     */
    public String toString()
    {
        return "[height = " + height + "cm " + ", radius = " + radius + "cm, Surface Area: " + getMeasure() + "cm^2, Volume: " + getVolume() + "cm^3] ";
    }
   
   /**
    * A class that checks whether two objects have the same contents 
    */ 
   public boolean equals(Object SodaCan)
   {
      if (SodaCan == this)
      {
          return true;
      }
      else
      {
          return false;
      }
   }
}
