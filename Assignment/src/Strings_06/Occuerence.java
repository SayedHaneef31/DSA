package Strings_06;

import java.util.*;
class Occerence
{
    public static void main(String[] args)
    {
        String sequence="aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word ="aaaba";
       int x= maxRepeating(sequence,word);
        System.out.println(x);
    }
    public static int maxRepeating(String sequence, String word)
    {
        if(!(sequence.contains(word)))
        return 0;
        int c=0;
        int a;
        for(int i=0;i<sequence.length();)
        {
        // public int indexOf(String str, int fromIndex)
        a=sequence.indexOf(word,i);
        if(a>=0)
        {
        c++;
        i=i+word.length();
        }
        else i++;
        }
        return c;
    }
}



   // int c=0;
//        String add=word;
//        while(sequence.contains(word)==true)
//        {
//            c+=1;
//            word=word+add;
//            //System.out.println(word);
//        }
//        return c;



// int len=word.length();
//         int c=0;
//         int a=0;
//         while(a<sequence.length())
//         {
//             a=sequence.indexOf(word,a);
//             c++;
//             a=a+len;
//         }

//         return c;