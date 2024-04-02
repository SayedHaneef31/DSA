package StacksNdQueues_16;

import java.util.Stack;

public class StacksMethods
{

    static void sortInsert(Stack<Integer> s,int k)
    {
        if(s.empty() || s.peek()<=k)
        {
            s.push(k);
            return;
        }

        int num=s.pop();

        sortInsert(s,k);

        s.push(num);

    }
    static void insert(Stack<Integer> s,int k)
    {
        if(s.empty())
        {
            s.push(k);
            return;
        }

        int num=s.pop();

        insert(s,k);

        s.push(num);
    }
    static void sort(Stack<Integer> s)
    {
        if(s.empty() )
        {
            return;
        }

        int num=s.pop();

        sort(s);

        sortInsert(s,num);


    }
}
