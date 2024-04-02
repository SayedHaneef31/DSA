package Recursion_08;

import java.util.Scanner;

public class sherlockGCD
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,3,4,2,1};
        System.out.println(max(arr));

    }
    static int max(int[] arr)
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max>arr[i])
                max=arr[i];

        }
        return max;
    }
}
