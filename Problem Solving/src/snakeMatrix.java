import java.util.*;
public class snakeMatrix
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        System.out.println("Enter elements");
        for(int i =0;i<n;i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int s,e;
        for(int i =0;i<n;i++)
        {
            if(i%2==0)
            {
                for (int j = 0; j < n; j++)
                {
                    System.out.print(arr[i][j]);

                }
            }
            else
            {
                for (int j = n-1; j >=0 ; j--)
                {
                    System.out.print(arr[i][j]);

                }
            }


        }


    }
}
