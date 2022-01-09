/**
 * A class NumbericQuestion to the question hierarchy of Section 9.1 This was
 * exercise P9.1 from Big Java: Late Objects
 * Note: I created a new method in the Question class called "getAnswer()" that gets the answer we are looking, because 
 * I try to put it in the NumericQuestion class but it appeared and error. So I changed to the Question class abd it worked.
 * Then the .parseDouble() method transforms the string into a double, so the number in the string could work with the "double" number.
 * @author: Miguel de la Cruz Cabello
 * @version: 03/01/2020
 */

 public class NumericQuestion extends EditQuestion
 {

    private double rightAnswer;
    private double answer;
    private double difference;
    
    /**
     * A class that checks the answer and decides whether it is true or false
     * @param reply
     * @return boolean true or false
     */
    public boolean checkResponse(String reply)
    {
        rightAnswer = Double.parseDouble(getAnswer());
        answer = Double.parseDouble(reply);
        difference = Math.abs(rightAnswer - answer);
        if (difference <= 0.01)
        {
            return true;
        }
        else
        {
            return false;
        }
    } 
 }