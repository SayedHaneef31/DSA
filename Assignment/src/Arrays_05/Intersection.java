package Arrays_05;

import java.util.*;
public class Intersection
{
    public static void main(String[] args)
    {
        int a[]={1,4,2,76,0,10,0,9,9,4,2,1};
        Arrays.sort(a);
        int temp[]=new int[a.length];
        int j=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                temp[j]=a[i];
                j++;
            }
        }
        temp[j]=a[a.length-1];
        System.out.println(Arrays.toString(temp));
//        for (int i = 1; i <temp.length ; i++)
//        {
//            a[i]
//        }


    }
}
