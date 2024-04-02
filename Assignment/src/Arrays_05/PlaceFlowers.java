package Arrays_05;

public class PlaceFlowers
{
    public static void main(String[] args)
    {
        int[] arr={0,0,0,0,1};
        int n=2;
        if(n==0) System.out.println("true");
        if(arr.length==1)
        {
            if(arr[0]==1 && n!=1) System.out.println("false");
            if(arr[0]==0 && n==1) System.out.println("true");
            System.out.println("false");
        }
        //boolean planted=false;
        for(int i=1;i<arr.length-1;i++)
        {

            if(arr[i]==0 && arr[i-1]!=1 && arr[i+1]!=1)
            {
                arr[i]=1;
                //planted=true;
                n--;
                if(n==0) System.out.println("true");
            }

        }
        if(arr[1]==0 && arr[0]==0 && n!=0)  n--;

        if(arr[arr.length-1]==0 && arr[arr.length-2]==0 && n!=0) n--;

        if (n == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
