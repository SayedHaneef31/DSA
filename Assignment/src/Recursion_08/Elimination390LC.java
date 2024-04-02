package Recursion_08;
import java.util.*;
public class Elimination390LC {
    public static void main(String[] args)
    {
        System.out.println(lastRemaining(9));

    }


    public static int lastRemaining(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) arr.add(i);

        return findIt(arr, 0);

    }

    static int findIt(ArrayList<Integer> arr, int pos) {
        if (arr.size() == 1) return arr.get(0);

        if (pos == 0)
        {
            if(arr.size()%2==0)
            {
                for (int i = arr.size() - 2; i >= 0; i -= 2)
                    arr.remove(i);

            }
            else
            {
                for (int i = arr.size() - 1; i >= 0; i -= 2)
                    arr.remove(i);
            }
            pos = 1;
            return findIt(arr, pos);
        }
        else
        {
            for (int i = arr.size() - 1; i >= 0; i -= 2)
                arr.remove(i);
            pos = 0;
            return findIt(arr, pos);
        }
        //return findIt(arr,pos);

    }
}