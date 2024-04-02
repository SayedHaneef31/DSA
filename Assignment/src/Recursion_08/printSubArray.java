package Recursion_08;

public class printSubArray
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        printt(0,0,arr);

    }
    static void printt(int s,int e,int[] arr)
    {
        if(s==arr.length) return;
        for(int i=s;i<=e && e< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        if(e< arr.length)
        {
            System.out.println();

            printt(s,e+1,arr);
        }
        else printt(s+1,s+1,arr);
//        System.out.println();
    } 
}
