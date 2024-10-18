import java.util.Scanner;

class NegativeAmount extends Exception
{
    public NegativeAmount(String s)
    {
        super(s);
    }

}
public class ErrorHandlingPractice
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount left");

        try
        {
            int n=sc.nextInt();
            if (n<0)
                throw new NegativeAmount("Amount is negative!!");
            else
                System.out.println("Hello");

        }
        catch (NegativeAmount e)
        {
            System.out.println(e.getMessage());
        }

    }
}
