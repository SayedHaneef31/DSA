package Strings_06;

public class merging
{
    public static void main(String[] args)
    {
        String word1="ab";
        String word2="pqrs";
        int l1=word1.length();
        int l2=word2.length();
//Sawaal to easy hai pr thouroly check karna parega!!!!!!!!!!!
        if(l1<1)
        {
            System.out.println(word2);
            System.exit(0);
        }
        if(l2<1)
        {
            System.out.println(word1);
            System.exit(0);
        }
        String s=new String("");
        int i1=0,i2=0;
        char ch1='\u0000';
        char ch2='\u0000';
        do
        {
            if(i1>=l1) ch1=' ';
            else ch1=word1.charAt(i1);
            if(i2>=l2) ch2=' ';
            else ch2=word2.charAt(i2);
            s=s+ch1;
            s=s+ch2;
            i1++;
            i2++;
        }
        while((i1<l1) || (i2<l2));
        System.out.println(s);

    }

}
