package Arrays_05;

import java.util.*;
public class rotated
{
    public static void main(String[] args)
    {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        ArrayList<Integer> arr=new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++) arr.add(nums[i]);       //arr me store kiya

        int pos=nums.length-1;     //pos=6
        for(int i=1;i<=k;i++)
        {
            int h=arr.get(pos);
            arr.remove(pos);
            arr.add(0,h);

            pos--;
        }
        for(int i=0;i<arr.size();i++)
        {
            nums[i]=arr.get(i);

        }

    }
}
