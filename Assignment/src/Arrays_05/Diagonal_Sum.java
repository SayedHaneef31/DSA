package Arrays_05;

import java.util.*;
public class Diagonal_Sum {
    public static void main(String[] args) {


        int mat[][] = {
                {7,3,1,9},
                {3,4,6,9},
                {6,9,6,6},
                {9,5,8,5}};
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
//        System.out.println(sum);
        int sum2=0;
        //int k = n - 1;
        for (int i = 0; i < n; i++)      //sum of secondary diagonal
        {
            for (int j = n-1; j >=0 ; j--)
            {
                if (i == j)
                {
                    sum2 += mat[i][j];
                   // System.out.println(sum2+"for i and j is="+i+j+mat[i][j]);

                }
            }

        }
        int tsum=sum+sum2;
        //System.out.println(sum2);
        //n=3;
        if(n%2==1)
        {
            int x=n/2;
//            System.out.println(x);
           // x=x+1;
            //System.out.println(mat[x][x]);
           tsum-=mat[x][x];

        }
        //
        else
            System.out.println(tsum);

    }
}
