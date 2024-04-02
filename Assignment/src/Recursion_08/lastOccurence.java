package Recursion_08;

public class lastOccurence
{
    public static void main(String[] args) {
        String s="abcddefg";
        System.out.println(last(s,s.length()-1,'d'));
    }
    static int last(String s,int i,char ch)
    {
        if(i<0) return -1;
        char ch1=s.charAt(i);
        if(ch1==ch) return i;
        else return last(s,i-1,ch);
    }
}
