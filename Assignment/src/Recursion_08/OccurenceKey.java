package Recursion_08;

import java.util.Scanner;

public class OccurenceKey
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={3,2,1,4,2,5,6,4,2,2,2,4,6,4,8};
        occuence(arr,0,2);

    }
    static void occuence(int arr[],int index,int key)
    {

        if(index==arr.length)
        {
            return;
        }

        if(arr[index]==key)
        {
            System.out.println(index);
        }
        occuence(arr,index+1,key);

    }
}
