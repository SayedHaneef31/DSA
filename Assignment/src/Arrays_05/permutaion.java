package Arrays_05;
import java.util.*;
public class permutaion
{
        public int[] buildArray(int[] nums)
        {
            int ans[]=new int[nums.length];
            for(int i=0;i<= nums.length;i++)
            {
                ans[i] = nums[nums[i]];
            }
            return ans;
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            permutaion obj=new permutaion();
            System.out.println("Enter no. of enteries u wanna put");
            int len=sc.nextInt();
           // int f_len=len-1;
            int[] nums=new int[len];
            System.out.println("Enter a zero based permutation araay list");
            for(int i=0;i<nums.length - 1;i++)
            {
                nums[i]=sc.nextInt();
            }
            int[] ans1=obj.buildArray(nums);
            System.out.println(Arrays.toString(ans1));
        }

}
