package Arrays_05;

import java.util.*;
public class mATRIX_DIAGONAL_sUM
{
    public static void main(String[] args)
    {
        int[][] mat= { {7,3,1,9},{3,4,6,9},{6,9,6,6},{9,5,8,5}}  ;
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int n = mat.length;       //To know no. of rows
        int sum = 0;
        for (int i = 0; i < n; i++)      //sum of primary diagonals
        {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += mat[i][j];
                    break;
                }

            }
        }
        System.out.println("sum of primary diagonals="+sum);

        for (int i = 0; i < n; i++)      //sum of secondary diagonal
        {
            sum +=mat[i][n-1-i];

        }
        System.out.println("sum of both diagonals="+sum);
        if(n%2==0) return sum;
        else
        {
            sum-=mat[n/2][n/2];
            return sum;
        }

    }
}




//for (int j = n - 1; j >= 0; j--) {
//        if (i == j)
//        {
//        int temp=mat[i][j];
//        sum += temp;
//        System.out.println("Temp="+temp);
//        }
//        }