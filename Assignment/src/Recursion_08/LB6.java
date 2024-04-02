package Recursion_08;
//Maximum sum of non adjacent elements
public class LB6
{
    public static void main(String[] args)
    {
        int arr[]={2,1,2,4,4,84,4,10};
        System.out.println(maxS(arr,0,0));
    }
    static int maxS(int[] arr,int i,int sum)
    {
        if(i>=arr.length ) return sum;

        //excluding ith element
        int a=maxS(arr,i+1,sum);
        //including ith element
        int b= maxS(arr,i+2,sum+arr[i]);

        return Math.max(a,b);
    }
}
