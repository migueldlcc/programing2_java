/**
 * A loop that cumputes the sum of all even numbers from 0 to 100
 * @author: Miguel de la Cruz Cabello
 * @version: 02/25/2020
 */

// Line 27 in the exam was wrong beause intead of adding 2 to the number to make it even, I increased by one so 
// it printed the sum of all numbers from 0 up to 100 (I just didn't read well the problem).
// By increasing by 1 the final result was 5050, which was not the result expected
// So by changing that to 2, it worked and returned 2550, which is the final result.

// Also in my previous code I created a variabel called "double input = in.nextDouble();" like:
        //for (i = 0, i <= 100, i++)
        //{
            // double input = in.nextDouble();
            // total = total + input;
        //}
// but the program didn't compile, so I delite the variable and used i, and then the program did compile.
// So here is the following:


class CorrectionExam
{
    public static void main(String[] args)
    {
        int total= 0;
        for (int i =0 ; i <= 100; i = i + 2)
        {
            total = total + i;
        }
        System.out.println(total);
    }
}
