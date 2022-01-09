public class TallyCounterTexter
{
    public static void main(String[] args)
    {
        // Create our own TallyCounter object!!
        // Call the constructor....
        // When we construct an object, we need to use the 'new' keyword
        TallyCounter counter = new TallyCounter();

        System.out.println("Counting 5 times. Expected output: 1");

        // To interact with our object, call its methods
        counter.count();

        TallyCounter peopleCounter = new TallyCounter();
        peopleCounter.count();
        peopleCounter.count();
    
        System.out.println(counter.getValue());
        
        System.out.println("Counting 1 more time. Expected output: 2");
        counter.count();

        System.out.println(counter.getValue());
        System.out.println(peopleCounter.getValue());

        System.out.println("Counting 1 more time. Expected output: 3");
        counter.count();

        System.out.println(counter.getValue());
        System.out.println(peopleCounter.getValue());

        System.out.println("Clearing counter. Expected output: 0");
        counter.reset();
        int result = counter.getValue();
        if (result != 0)
        {
            System.out.println("BIG ERROR");
        }

    }
}