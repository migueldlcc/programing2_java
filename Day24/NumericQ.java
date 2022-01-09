public class NumericQ extends Question
{
	private double answer;

	public boolean checkAnswer(String response)
	{
        double responseDouble = Double.parseDouble(response);
        return Math.abs(responseDouble - answer) <= 0.01;
	}
}