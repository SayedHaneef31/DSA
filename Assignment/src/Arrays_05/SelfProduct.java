package Arrays_05;

import java.util.Arrays;

public class SelfProduct
{
    public static void main(String[] args) 
    {
        int lp=1,rp=1;

        int nums[]={-1,1,0,-3,3};
        int arr[]=new int[nums.length];
        for(int i = 0; i<nums.length; i++)
        {
            int Lk=i-1;
            //Left product
            if(Lk==-1) lp=1;
            else
            {
                while(Lk>=0)
                {

                    lp=lp*nums[Lk];
                    Lk--;
                }
            }
            System.out.println("for "+nums[i]+ " Left Product is="+lp);
            // right product
            int Rk=i+1;
            if(Rk==nums.length) rp=1;
            else
            {
                while(Rk<nums.length)
                {

                    rp=rp*nums[Rk];
                    Rk++;
                }
            }
            System.out.println("for "+nums[i]+ " Right Product is="+rp);
            arr[i]=lp*rp;
            lp=1;rp=1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
