package StacksNdQueues_16;

import java.util.Stack;

public class Asteroid
{
    public static void main(String[] args)
    {
        int[] a={10,2,-5};
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<a.length;i++)
        {
            if(s.empty())
            {
                s.push(a[i]);
                continue;
            }
            int prev=s.peek();
            int curr=a[i];
            if(sameSignChecker(prev,curr))
            {
                s.push(curr);
            }
            else //prev and curr opposite sign ke hai
            {
                if(Math.abs(prev)==Math.abs(curr))
                    s.pop();
                else if(prev>=0 && curr<0)  //opposite direction
                {
                    int min=Math.min(prev,Math.abs(curr));
                    if(min==Math.abs(curr)) continue;
                    else
                    {
                        s.pop();
                        s.push(curr);
                    }
                }
                else  //opposite direction   (prev<0 && curr>=0)
                {
                    int min=Math.min(Math.abs(prev),curr);
                    if(min==curr) continue;
                    else
                    {
                        s.pop();
                        s.push(curr);
                    }
                }
            }
        }
        int[] array = new int[s.size()];

        // Fill the array in the forward order
        for (int i = 0; i < s.size(); i++) {
            array[i] = s.elementAt(i);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
    static boolean sameSignChecker(int a,int b)
    {
        if((a>=0 && b>=0)|| (a<0 && b<0)) return true;
        return false;
    }
}





