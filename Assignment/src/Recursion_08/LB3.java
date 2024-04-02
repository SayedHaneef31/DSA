package Recursion_08;

import java.util.Scanner;

import java.util.*;
public class LB3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 10, 15, 20, 20, 25, 25, 25};
        int target=-8;
        System.out.println(bSearch(arr, 0, arr.length-1 , target ));
    }

    static boolean bSearch(int[] arr,int s,int e, int target)
    {
        if(s>e)
            return false;

        int m=(s+e)/2;
        if(arr[m]<target)
            return bSearch(arr,s,m-1,target);
        else if (arr[m]>target)
            return bSearch(arr,m+1,e,target);
        else return true;


    }
}
