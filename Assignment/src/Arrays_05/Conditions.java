package Arrays_05;

public class Conditions
{
    public static void main(String[] args)
    {

        int arr[]={0,0};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if((i!=j) && (arr[i] == 2 * arr[j]))
                    System.out.println(true);//;return true;
            }
        }
        System.out.println(false);//return false;
    }
}
