package Arrays_05;

import java.util.*;
public class JumpGame
{
    public static void main(String[] args)
    {
        int nums[]={1};
        int c=0;
        for(int i=1;i<nums.length;i++)
        {
            int k=nums[i];
            if(k>0)
            {
                i=i+k;
                if(i==nums.length-1)
                {
                    c=1;
                    break;
                }
            }
        }
        if(c==1)
            System.out.println("true");
        else
            System.out.println("false");

    }
}
