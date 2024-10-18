package Arrays_05;
import java.util.*;
public class MatrixAddition
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int arr1[][]=new int[n][n];
        int arr2[][]=new int[n][n];

        System.out.println("Enter the values of 1st matrix");
        for (int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr1[i][j]=sc.nextInt();

            }
        }
        System.out.println("Enter the values of 2st matrix");
        for (int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr2[i][j]=sc.nextInt();

            }
        }

        for (int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr1[i][j]=arr1[i][j]+arr2[i][j];

            }
        }

        for (int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(arr1[i][j]+"\t");
//                arr2[i][j]=sc.nextInt();

            }
            System.out.println();
        }
    }


}
