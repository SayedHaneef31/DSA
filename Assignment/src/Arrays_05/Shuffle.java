package Arrays_05;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args)
    {
        int nums[]={2,5,1,3,4,7};
        int n=3;
        int arr[]=new int[2*n];
        int a=0;int b=n;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                arr[i]=nums[a];
                a++;
            }
            else
            {
                arr[i]=nums[b];
                b++;
            }

        }
//        return arr;
        System.out.println(Arrays.toString(arr));

   }
}


//
//    int nums[]={2,5,1,3,4,7};
//    int n=3;
//    int i, j;
//    int[] ar = new int[2 * n];
//    int k = 0;
//        for (i = 0; i < (2 * n); i += 2) {
//        ar[i] = nums[k];
//        k++;
//        }
//        int h = 0;int c=1;
//        for (j = 0; j < n; j++)
//        {
//        ar[c] = nums[n + h];
//        h++;
//        c=c+2;
//
//        }