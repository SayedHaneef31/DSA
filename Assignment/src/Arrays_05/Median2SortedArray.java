package Arrays_05;

public class Median2SortedArray
{
    public static void main(String[] args)
    {
        int[] nums1={1,3};
        int[] nums2={2,7};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2)
    {

        int n1=nums1.length;
        int n2=nums2.length;
        if(n1==0)
        {
            double m2=(n2%2==0)?evenMedian(nums2,n2):oddMedian(nums2,n2);
            return m2;
        }
        if(n2==0)
        {
            double m1=(n1%2==0)?evenMedian(nums1,n1):oddMedian(nums1,n1);
            return m1;
        }
        int a[]=new int[n1+n2];
        int i;int p1=0,p2=0;
        for(i=0;i<a.length && p1<n1 && p2<n2;i++)
        {
            if(nums1[p1]<=nums2[p2])
            {
                a[i]=nums1[p1];
                p1++;
            }
            else
            {
                a[i]=nums2[p2];
                p2++;
            }
        }
        while(p2<n2)
        {
            a[i++]=nums2[p2++];
        }
        while(p1<n1)
        {
            a[i++]=nums1[p1++];
        }
        int nn=a.length;
        double m1=(nn%2==0)?evenMedian(a,nn):oddMedian(a,nn);
        // double m1=(n1%2==0)?evenMedian(nums1,n1):oddMedian(nums1,n1);
        // double m2=(n2%2==0)?evenMedian(nums2,n2):oddMedian(nums2,n2);
        return m1;



    }
    static int oddMedian(int[] arr,int n1)
    {
        int res=(int)n1/2;
        return arr[res];
    }
    static double evenMedian(int[] arr,int n2)
    {
        int res1=(int)((n2-1)/2);

        return (double)(arr[res1]+arr[res1+1])/2;
    }

}





