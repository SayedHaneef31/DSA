package Arrays_05;

import java.util.*;
public class Spiral_M2
{
    public static void main(String[] args)
    {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
            ArrayList<Integer> a=new ArrayList<Integer>();
            int top=0,left=0;
            int down=matrix.length-1,right=matrix[0].length-1;
            int dir=0;
            while(top<=down && left<=right)
            {
                if(dir==0)
                {
                    for(int i=top;i<=right;i++)
                    {
                        System.out.println(i);
                        a.add(matrix[top][i]);
                    }
                    top++;
                }
                if(dir==1)
                {
//                    System.out.println("Hello");
                    for(int i=top;i<=down;i++)
                    {
                        a.add(matrix[i][right]);
                    }
                    right--;
                }
                if(dir==2)
                {
                    for(int i=right;i>=left;i--)
                    {
                        a.add(matrix[down][i]);
                    }
                    down--;
                }
                if(dir==3)
                {
                    for(int i=down;i>=top;i--)
                    {
                        a.add(matrix[i][left]);
                    }
                    left++;
                }

                dir=(dir+1)%4;
            }
//            return a;
        for (int i = 0; i < a.size(); i++)
            System.out.print(a.get(i) + " ");
        }
    }








