package Recursion_08;
import java.util.*;
public class occurance
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,5,7,88,7,3};
        System.out.println(getIndex(arr,12,0));


    }
    static int getIndex(int[] arr,int key,int i)
    {
        if(i>arr.length-1)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return getIndex(arr, key, i+1);
    }
}
