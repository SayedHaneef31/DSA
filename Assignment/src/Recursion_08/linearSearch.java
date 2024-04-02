package Recursion_08;

import java.util.Scanner;

public class linearSearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=69;
        System.out.println(search(arr,0,target));

    }
    static boolean search(int[] arr,int index,int target)
    {
        if(index==arr.length)
        {
            return false;
        }
        if(arr[index]==target) return true;
        else return  search(arr,index+1,target);

    }
}
