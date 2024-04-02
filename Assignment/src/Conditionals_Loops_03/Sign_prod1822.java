package Conditionals_Loops_03;

import java.util.*;
public class Sign_prod1822
{
    public static void main(String[] args)
    {
        int[] num={9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        System.out.println( arraySign(num));
    }
    public static int arraySign(int[] nums)
    {
        long p=1;
        for(int i=0;i<nums.length;i++)
        {
            p=p*nums[i];
        }
        return signFunc(p);
    }
    static int signFunc(long prod)
    {
        System.out.println("PRODUCT IS="+prod);
        if(prod==0) return 0;
        return (prod>0)? 1 :-1;
    }
}
