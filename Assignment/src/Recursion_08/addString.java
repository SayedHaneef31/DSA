package Recursion_08;

public class addString
{
    public static void main(String[] args) {
        String s="11";
        String str="123";
        System.out.println(addStrings(s,str));
    }
    public static String addStrings(String num1, String num2)
    {
        //int max=Math.max(num1,num2);
        return addRecursion(num1,num2,num1.length()-1,num2.length()-1,0,"");
    }
    static String addRecursion(String num1,String num2,int p1,int p2,int carry,String ans)
    {
        //base case

        if(p1<0 && p2<0)
        {
            if(carry ==0)
                return ans;
            else
                return carry+ans;
        }



        //ek case solve
        int a=(p1>=0) ? num1.charAt(p1)-'0':0;
        int b=(p2>=0) ? num1.charAt(p2)-'0':0;
        int sum=a+b+carry;
        carry=sum/10;
        ans=sum+ans;

        //recursion
        return addRecursion(num1,num2,p1-1,p2-1,carry, ans);

    }


}





// static String reverse(String s)
//     {
//         String rev="";
//         for(int i=0;i<s.length();i++)
//         {
//             char ch=s.charAt(i);
//             rev=ch+rev;
//         }
//         return rev;

//     }