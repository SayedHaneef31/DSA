package Strings_06;

public class kth
{
    public static void main(String[] args) {
        //n = 2, k = 1
        System.out.println(kthGrammar(2,1));
    }
        static int kthGrammar(int n, int k)
        {
            if(n==1) return 0;
            int kk=2;
            String s="0";
            while(kk<=n)
            {
                if(n%2==0)
                    s=s.replace("0","01");
                else
                    s=s.replace("1","10");
            }
            return s.charAt(k-1);
        }
    }

