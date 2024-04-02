package Recursion_08;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={5,6,2,3,8,9,10};

        mergeSortInPlace(arr,0,arr.length);
        System.out.println("********************************************************");
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int[] arr,int s,int e)
    {
        if(e-s==1)
            return;

        int mid=(s+e)/2;

        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr,s,mid,e);
    }

    private static void mergeInPlace(int[] arr, int s, int mid, int e)
    {
        int mix[]=new int[e-s];

        int i=s;
        int j=mid;
        int k=0;

        while(i<mid && j<e)
        {
            if(arr[i]<arr[j])
            {
                mix[k]=arr[i];
                i++;
            }
            else
            {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid)
        {
            mix[k]=arr[i];
            i++;k++;
        }
        while(j<e)
        {
            mix[k]=arr[j];
            j++;k++;
        }

        for (int l = 0; l < mix.length; l++)
        {
            arr[s+l]=mix[l];

        }
        System.out.println(Arrays.toString(arr));
    }
}
