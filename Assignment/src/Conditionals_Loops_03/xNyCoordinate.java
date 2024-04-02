package Conditionals_Loops_03;

import java.util.*;

public class xNyCoordinate
{
    public static void main(String[] args)
    {
        int x=3;
        int y=4;
        int[][] points = {{3,4}};
        //int[][] points = { {1,2},{3,1},{2,4},{2,3},{4,4} };
        int min_d=-1;
        int man_d=0;

        for(int i=0;i<points.length;i++)
        {
            if(x==points[i][0] || (y==points[i][1]))
            {
                int d=Math.abs(x -points[i][0] ) + Math.abs(y - points[i][1]);
                if(d>man_d)
                {
                    man_d=d;
                    min_d=i;
                }
            }

        }
        System.out.println(min_d);

    }
}
