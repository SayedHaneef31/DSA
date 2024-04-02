package Arrays_05;

import java.util.Arrays;

public class PsitionOneandZero
{
    public static void main(String[] args) {

        //],[],[]
        int arr[][] = {{0, 1, 1}, {1, 0, 1}, {0, 0, 1}};

        int arrrr[][] = onesMinusZeros(arr);
        for (int i = 0; i <arrrr.length; i++) {
            for (int j = 0; j < arrrr[0].length; j++) {

                System.out.print(arrrr[i][j]);

            }
            System.out.println();
        }
    }



    public static int[][] onesMinusZeros(int[][] grid)
    {
        int m = grid.length;
        int n = grid[0].length;
        int[] arR = new int[m];
        for (int i = 0; i < m; i++)
        {
            int c = 0;
            for (int j = 0; j < n; j++)
            {
                if (grid[i][j] == 1)
                    c++;
            }
            arR[i] = c;
        }

        //{{0, 1, 1}, {1, 0, 1}, {0, 0, 1}}


        int[] arC = new int[n];
        for (int i = 0; i < n; i++)
        {
            int c = 0;
            for (int j = 0; j < m; j++)
            {
                if (grid[i][j] == 1)
                    c++;
            }
            arC[i] = c;
        }
        int k = 0;
        int[][] diff = new int[m][n];
        for (int i = 0; i < m; i++)
        {

            for (int j = 0; j < n; j++)
            {
                diff[i][j] = arR[k] + arC[k] - (n - arR[k]) - (m - arC[k]);
                k++;
            }

        }

        return diff;
    }
}

