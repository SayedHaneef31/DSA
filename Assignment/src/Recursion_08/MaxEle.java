package Recursion_08;

public class MaxEle
{
    public static void main(String[] args)
    {
        int arr[]={1,2,5,75,1,66666666,57,12};
        System.out.println(maxx(arr,Integer.MIN_VALUE,0));

    }
    static int maxx(int[] arr, int max,int index)
    {
        if(index>=arr.length)
            return max;

        if(arr[index]>=max)
            max=arr[index];
        return maxx(arr, max, index+1 );
    }
}
