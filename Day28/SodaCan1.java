public class SodaCan1 implements Measurable
{
    SodaCan1(double h, double r)
    {
        this.height = h;
        this.radius = r;

    }

    private double height;
    private double radius;

    double getSurfaceArea()
    {
        return Math.PI * height * radius * 2;
    }

    double getVolume()
    {
        return Math.PI * height * radius * radius;
    }

    public double getMeasure() 
    {
        return Math.PI * height * radius * 2;
    }

    public double average(Measurable[] arr)
    {

        if(arr.length ==0)
        {
            return  0;
        }

        double sum =0;
       
        for(Measurable object:arr)
        {
            sum += object.getMeasure();
        }
        return sum / arr.length;

    }


}
