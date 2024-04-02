package Recursion_08;

public class BuyNdSellStocks
{
    public static void main(String[] args)
    {
        int [] arr={7,1,5,3,6,4};
        System.out.println(find(arr,0,Integer.MAX_VALUE,Integer.MIN_VALUE));

    }
    static int find(int arr[],int i,int minp,int maxp)
    {
        if(i==arr.length)
         return maxp;
        if(arr[i]<minp) minp=arr[i];

        if(arr[i]-minp>maxp) maxp=arr[i]-minp;

        return find(arr,i+1,minp,maxp);
    }
}
