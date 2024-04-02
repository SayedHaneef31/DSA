package Recursion_08;

import java.util.Scanner;

//Check whther array is sorted or not
import java.util.*;
public class LB2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr={5,10,15,20,20,25,25,25};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int arr[],int i)
    {
        if(i==arr.length-1)
            return true;
        if(arr[i]<=arr[i+1])
        return sorted(arr,i+1);
        else return false;
    }
}
