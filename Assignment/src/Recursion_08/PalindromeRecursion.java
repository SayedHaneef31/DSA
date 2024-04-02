package Recursion_08;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class PalindromeRecursion
{
    public static void main(String[] args) {
        int n=122321;
        char[] digits = String.valueOf(n).toCharArray();
        System.out.println(palin(digits,0, digits.length-1));

    }
    static boolean palin(char[] ch,int i,int j)
    {
        if(i>=j)

        {
            return true;
        }
        if(ch[i]==ch[j])
        {
            i++;
            j--;
            return palin(ch,i,j);
        }

        else return false;
    }
}
