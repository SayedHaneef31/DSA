import java.util.*;
public class antiClock
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Order btaaao!!");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int angle;
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        System.out.println("Now Enter elements");
        for (int i = 0; i < m; i++)                              //Inputing the array
        {
            for (int j = 0; j < n; j++) {

                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Bataao bhai 90 ka multiple!!");
        System.out.println("Kitta angle?");
        angle = sc.nextInt();
        for (int k = 1; k <= angle / 90; k++)
        {
            rotateMatrixANTICLOCK(a, b, m, n);
            for (int i = 0; i < m; i++)                           //Copying the elements of b in a
            {
                for (int j = 0; j < n; j++) {
                    a[i][j] = b[i][j];
                }
            }
        }
        //*************************************  PRINTING   *********************************
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j]);
                //a[i][j]=sc.nextInt();
            }
            System.out.println();
        }

    }
    static void rotateMatrixANTICLOCK(int[][] a, int[][] b, int m, int n)
    {
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {

                b[(n - 1) - j][i] = a[i][j];
//                System.out.print(b[i][j]);
            }
//            System.out.println();
        }
    }
}
