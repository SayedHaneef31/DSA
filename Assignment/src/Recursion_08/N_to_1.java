package Recursion_08;

public class N_to_1
{
    public static void main(String[] args)
    {
        int n=5;
        //rev_number(n);
    }
    static int number(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return n;

        }
        System.out.println(n);
        return number(n-1);
    }
//    static int rev_number(int n)             ********NOT WORKING***********
//    {
//        if(n==1)
//        {
//            System.out.println(n);
//            return n;
//
//        }
//
//        return number(n-1);
//        System.out.println(n);
//    }
}
