package Arrays_05;

import java.util.Arrays;

class ReshapeMatrix
{
    public static void main(String[] args)
    {
        int[][] mat={{1,2},{3,4}}  ;
        int r=1;
        int c=4;
        matrixReshape(mat,r,c);
    }
    public static void matrixReshape(int[][] mat, int r, int c)
    {
        int rl=mat.length;
        int cl=mat[0].length;
        if((rl*cl) != (r*c)) System.out.println("Same hai bhai");
        int[][] arr= new int[r][c];
        int[] a=new int[rl*cl];
        int k=0;
        for(int i=0;i<rl;i++)
        {
            for(int j=0;j<cl;j++)
            {
                a[k]=mat[i][j];
                k++;
            }
        }
        k=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=a[k];
                k++;
            }
        }
        for (int row = 0; row < arr.length ; row++)
        {
            System.out.println(Arrays.toString(arr[row]));

        }
       
    }
}