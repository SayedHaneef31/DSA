package StacksNdQueues_16;
import java.util.*;
public class AlternateDuplicates
{
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
    public static String removeDuplicates(String s)
    {
        Stack<Character> stack=new Stack<>();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            if(stack.empty())
            {
                continue;
            }
            else
            {
                char ch=s.charAt(i);
                if( ch!=stack.peek())
                {
                    stack.push(ch);
                }
                else
                {
                    stack.pop();
                    //while(ch==stack.peek())
                }

            }

        }
        StringBuilder sb=new StringBuilder();
        while(!stack.empty())
        {
            sb.insert(0,stack.pop());
        }
        return sb.toString();
    }
}




