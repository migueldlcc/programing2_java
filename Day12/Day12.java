import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Day12

{
    public static void main(String[] args) throws FileNotFoundException
    { 
        File inFile = new File("Data.txt");
        PrintWriter outFile = new PrintWriter("result.txt");
        Scanner in = new Scanner(inFile);

        while (in.hasNext())
        {
            outFile.println(in.nextLine());
            outFile.println("NEXT");
        }
        in.close();
        outFile.close();

        System.out.println("DONE");
    }
}