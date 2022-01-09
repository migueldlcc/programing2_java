/**
 * A class that tests different numeric questions and says if they are true or false depending if the "abs" is smaller or equal than the tolereance (0.01).  
 * @author: Miguel de la Cruz Cabello
 * @version: 03/02/2020
 */
import java.util.Scanner;
public class NumericQuestionTester
{
    public static void main(String[] args)
    {
        
        NumericQuestion a = new NumericQuestion();
        a.setText("What is pi?");
        a.setAnswer("3.14159");

        NumericQuestion b = new NumericQuestion();
        b.setText("What is 16.12345 + 2.1357?");
        b.setAnswer("18.25915");

        NumericQuestion c = new NumericQuestion();
        c.setText("What is e?");
        c.setAnswer("2.718281828");
        
        processQuestion(a);
        processQuestion(b);
        processQuestion(c);

    }

    /**
     * A class that processes the answer of the question and checks if it's true or false
     * Note: Before creating this class, I tried to put this piece of code into a while loop, because since its running over and over
     * I thought it might work but it didn't, so I decided to put it into a completely new method.
     */
    public static void processQuestion(NumericQuestion q)
    {
        q.display();
        System.out.println("Your answer: ");
        Scanner in = new Scanner(System.in);
        String reply = in.nextLine();
        System.out.println(q.checkResponse(reply));
    }
}