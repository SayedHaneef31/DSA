package Arrays_05;
import java.util.*;
public class KthElement
{
    public static void main(String[] args)
    {
        int nums[]={1,2,3,4};
        Arrays.sort(nums);
        int k=5;
        int minIndex=-1;
        int i=0;
        while(i<nums.length && nums[i]<k)
        {
            minIndex=i;
            i++;
        }
        if(minIndex==-1) System.out.println("0");
        int c=0;
        for(i=0;i<=minIndex-1;i++)
        {
            if(nums[i]==0) continue;
            for(int j=i+1;j<=minIndex;j++)
            {
                if(nums[j]==0) continue;
                if(nums[i]+nums[j]==k)
                {
                    c++;
                    nums[i]=0;
                    nums[j]=0;
                    break;

                }

            }

        }
        System.out.println(c);

    }
}
