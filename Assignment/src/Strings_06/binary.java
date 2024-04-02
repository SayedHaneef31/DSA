package Strings_06;
import java.util.*;
public class binary
{
    public static void main(String[] args)
    {
        int[] nums={3,6,2,3};
        if(nums.length==3) System.out.println(nums[0]+nums[1]+nums[2]);
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=2;i--)
        {
            if(nums[i-2]+nums[i-1]>nums[i])
            {
                System.out.println(nums[i]+nums[i-1]+nums[i-2]);
                System.exit(0);
            }

        }
        System.out.println("0");
    }

}



