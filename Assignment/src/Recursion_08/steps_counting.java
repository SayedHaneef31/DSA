package Recursion_08;
//    Given an integer num, return the number of steps to reduce it to zero.
//
//        In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
public class steps_counting
{
    public static void main(String[] args)
    {
          int n=8;
        System.out.println(steps(n));

    }
    static int steps(int n)
    {
        return helper(n,0);
    }
    static int helper(int n,int counter)
    {
        if(n==0)
            return counter;
        if(n%2==0)
            return helper(n/2,counter+1);
        else return helper(n-1,counter+1);
    }
}
