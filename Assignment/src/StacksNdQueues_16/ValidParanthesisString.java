//package StacksNdQueues_16;
//import java.util.*;
//public class ValidParanthesisString
//{
//    public static void main(String[] args)
//    {
//        System.out.println(checkValidString("(*))"));
//
//    }
//    public boolean checkValidString(String s)
//    {
//        if(s.length()==1 && s.charAt(0)!='*') return false;
//        if(s.length()==1 && s.charAt(0)=='*') return true;
//        Stack<Character> st=new Stack<Character>();
//        int star=0;
//        int bracket=0;
//        for(int i=0;i<s.length();i++)
//        {
//            char ch=s.charAt(i);
//            if(ch=='(')
//            {
//                st.push(ch);
//            }
//            else if(ch==')')
//            {
//
//                if(!st.isEmpty() && st.peek()=='(')
//                {
//                    st.pop();
//                    continue;
//                }
//                if(star==0) return false;
//                star--;
//            }
//            else
//                star++;
//        }
//        if(!st.isEmpty()) return false;
//        // if(bracket==0)  return true;
//        // if((star+bracket)%2==0) return true;
//        return true;
//    }
//}
//
//
