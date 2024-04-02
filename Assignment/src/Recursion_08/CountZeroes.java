package Recursion_08;

public class CountZeroes
{
    static int haneef=0;
    public static void main(String[] args)
    {
        int n=402033;
        int count=0;
        zeroes(n,count);
//        System.out.println(haneef);
        System.out.println(count);


    }

    static int zeroes(int n,int count)
    {
        if(n==0) {
//            haneef=count;
            return count;
        }
        if(n%10==0)
            return zeroes(n/10,count+1);
        else
            return zeroes(n/10,count);

        }
    }

