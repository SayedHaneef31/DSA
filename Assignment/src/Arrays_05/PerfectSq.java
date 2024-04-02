package Arrays_05;

import java.util.*;
public class PerfectSq
{
    public static void main(String[] args)
    {
        int num=808201;
        if(num==1)
            System.out.println(true);
        int start=1;
        int end=num/2;
        //System.out.println(end);
        int sq;
        while(start<=end)
        {
            int mid=start + (end - start) / 2;
            System.out.println(mid);
            sq=mid*mid;
            if(sq>num)
            {
                end=mid-1;
            }
            else if(sq<num)
            {
                start=mid+1;
            }
            else if(sq==num)
                System.out.println(true);
           // System.out.println(sq);

        }

        System.out.println(false);

    }
}
