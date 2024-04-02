package Recursion_08;

import java.util.ArrayList;
import java.util.Scanner;

public class searchWithArrayList
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int arr[]={2,3,4,5,6,7,7,7,7,8,9};
        int target =7;
//        System.out.println(findAll1(arr,target,list,0));
        System.out.println(findAll2(arr,target,0));


    }
    static ArrayList<Integer> findAll1(int[] arr,int target,ArrayList<Integer> list,int index)    //Using arrayList as a parameter
    {
        if(index==arr.length) return list;
        if(arr[index]==target)
            list.add(index);
        return findAll1(arr, target, list, index+1);

    }


    static ArrayList<Integer> findAll2(int[] arr,int target,int index)
    {
        ArrayList<Integer> list =new ArrayList<>();
        if(index==arr.length) return list;
        if(arr[index]==target) list.add(index);
        ArrayList<Integer> ansFromBelowCode=findAll2(arr, target, index+1);
        list.addAll(ansFromBelowCode);
        return list;
    }
}
