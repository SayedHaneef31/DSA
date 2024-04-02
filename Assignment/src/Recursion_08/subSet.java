package Recursion_08;

import java.util.ArrayList;

public class subSet
{
    public static void main(String[] args) {

        //totalSubset("","abc");
        System.out.println(totalSubset2("","abc"));
    }

    static void totalSubset(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        totalSubset(p+ch, up.substring(1));
        totalSubset(p, up.substring(1));

    }

    static ArrayList<String> totalSubset2(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left=totalSubset2(p+ch, up.substring(1));
        ArrayList<String> right=totalSubset2(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
