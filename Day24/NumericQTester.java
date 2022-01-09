import java.util.Scanner;
public class NumericQTester
{
	public static void main(String[]args)
	{
		NumericQ first=new NumericQ();
		first.setText("what is the value of 4/3 ?");
		first.setAnswer("1.33333");
		NumericQ second=new NumericQ();
		second.setText("what is the value of 7/3 ?");
		second.setAnswer("2.333333");
		
		
		presentQuestion(first);
		presentQuestion(second);
	}
	public static void presentQuestion(NumericQ q)
	{
		q.display();
		System.out.print("your answer: ");
		Scanner in=new Scanner(System.in);
		String response=in.nextLine();
		System.out.println(q.checkAnswer(response));
	}
}