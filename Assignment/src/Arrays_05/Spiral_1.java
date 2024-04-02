package Arrays_05;
import java.util.*;
public class Spiral_1
{
    public static void main(String[] args)
    {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        ArrayList<Integer> a=new ArrayList<Integer>();
        int n=matrix.length;
        int m=matrix[0].length;
        int minc=0,minr=0;
        int maxc=n-1,maxr=n-1;
        int tne=m*n;
        int c=0;       //counter
        while(c<tne)
        {
            //top line
            for(int i=minr,j=minc;j<=maxc && c<tne;j++)
            {
                a.add(matrix[i][j]);
                c++;
            }
            minr++;

            //right Line
            for(int i=minr,j=maxc;i<=maxr && c<tne;i++)
            {
                a.add(matrix[i][j]);
                c++;
            }
            maxc--;

            //Bottom Line
            for(int i =maxr,j=maxc;j>=minc && c<tne;j--)
            {
                a.add(matrix[i][j]);
                c++;
            }
            maxr--;

            //Left line
            for(int i=maxc,j=minc;i>=minc && c<tne;i--)
            {
                a.add(matrix[i][j]);
                c++;
            }
            minc++;

        }
        System.out.println("Counter="+c);
//        System.out.println();
        for (int i = 0; i < a.size(); i++)
            System.out.print(a.get(i) + " ");
    }
}
