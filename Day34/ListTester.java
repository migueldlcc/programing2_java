import java.util.LinkedList;
/**
 * A class that tests whether or not a given object belongs to a list.
 * This was exercise P16.10 from Big Java: Late Objects.
 * @author: Miguel de la Cruz Cabello
 * @version: 04/22/2020
 */
public class ListTester
{
    public static void main(String[] args)
    {
        LinkedList<String> clubs = new LinkedList<String>();
        clubs.addFirst("Real Madrid");
        clubs.addFirst("Liverpool");
        clubs.addFirst("Juventus");
        clubs.addFirst("Manchester United");
        clubs.addFirst("Ajax");
        System.out.println("Clubs who have won a Champions League: " + clubs);
        
        System.out.println("Has Manchester City won a Champions League?");
        System.out.println(clubs.contains("Manchester City"));
        System.out.println("Has Manchester United won a Champions League?");
        System.out.println(clubs.contains("Manchester United"));
        System.out.println("Has PSG won a Champions League? ");
        System.out.println(clubs.contains("PSG"));
         
    }
}