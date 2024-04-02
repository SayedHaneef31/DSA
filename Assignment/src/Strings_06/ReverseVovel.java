package Strings_06;

public class ReverseVovel
{
    public static void main(String[] args) {

        String string="leetcode";
                char[] ss=string.toCharArray();
                int s=0;int e=string.length()-1;
                while(s<e)
                {
                    char ch=ss[s];
                    char ch1=ss[e];
                    if((ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U') && (ch1=='a' ||ch1=='e' ||ch1=='i' ||ch1=='o' ||ch1=='u' ||ch1=='A' ||ch1=='E' ||ch1=='I' ||ch1=='O' ||ch1=='U'))
                    {
                        char temp=ss[s];
                        ss[s]=ss[e];
                        ss[e]=temp;
                        s++;e--;
                    }
                    if(!(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U'))
                    {
                        s++;
                        continue;
                    }
                    if(!(ch1=='a' ||ch1=='e' ||ch1=='i' ||ch1=='o' ||ch1=='u' ||ch1=='A' ||ch1=='E' ||ch1=='I' ||ch1=='O' ||ch1=='U'))
                    {
                        e--;
                        continue;
                    }

                }
//                return ss.toString();
        System.out.println(ss.toString());

    }
}
