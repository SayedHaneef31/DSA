package Recursion_08;
//Minimum element sums up to a target
public class LB5
{
    public static void main(String[] args) {
        int arr[]={1,2};
        System.out.println(minnn(arr,5));
    }
    static int minnn(int arr[],int target)
    {
        if(target==0) return 0;
        if(target<0) return Integer.MAX_VALUE;


        //1 case solve kardo...baaki recursion dekhegaaa!!
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int m=minnn(arr,target-arr[i]);
            if(m!=Integer.MAX_VALUE)
            mini=Math.min(mini,m+1);
        }

        return mini;


    }

}
