package Recursion_08;
//Program to remove specific character from a string
public class removeChar
{
    public static void main(String[] args)
    {
        //remove("","abbacd",'a');        //1
        System.out.println(removeRet("","aaaaaajgdgsgsgaaaatrgssrasaraktajaj",'a'));      //2

    }

    static void remove(String p,String up,char c)          //printing it right there.......1
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        if(ch==c)
            remove(p,up.substring(1),c);
        else remove(p+ch,up.substring(1),c);



    }

    static String removeRet(String p,String up,char c)          //return the string..........2
    {
        if(up.isEmpty())
        {
            return p;
        }

        char ch=up.charAt(0);
        if(ch==c)
            return removeRet(p,up.substring(1),c);
        else
            return removeRet(p+ch,up.substring(1),c);

    }
}
