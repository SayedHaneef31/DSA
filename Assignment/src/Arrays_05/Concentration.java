package Arrays_05;

import java.util.*;

public class Concentration
{
    public static void main(String[] args)
    {
        int nums[]={1,2,1};
        int len=nums.length;
        int len_final=2*len;
        int ans[]=new int[len_final];
        for(int i=0;i<len;i++)
        {
            ans[i]=nums[i];
        }
        int k=0;
        for(int i=len;i<len_final;i++,k++)
        {

            ans[i]=nums[k];
            System.out.println(k);
            //++k;
        }
        System.out.println(Arrays.toString(ans));
        //return ans;
    }
}

