package Recursion_08;

public class removeString
{
    public static void main(String[] args) {
        remove("","abcdhaneehaneefabcd","haneef");
    }

    static void remove(String p,String up,String str)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        if(up.startsWith(str))
            remove(p,up.substring(str.length()),str);
        else remove(p+up.charAt(0),up.substring(1),str);


    }
}
