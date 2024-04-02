package StacksNdQueues_16;

import java.util.Stack;

public class trial
{
    public static void main(String[] args) {
        Stack<Character> str=new Stack<>();

        str.push('o');
        str.push('5');
        str.push('8');
        str.push('d');
        str.add('k');
        str.push('w');
        str.push('y');
        System.out.println(str.size());
        System.out.println(str.contains('l'));
        System.out.println("Pos="+str.search('k'));
//        str.add('l');
        System.out.println(str);
        Stack<Character> ssss= (Stack<Character>) str.clone();
        System.out.println(ssss);
        str.clone();

        System.out.println(str.indexOf('w'));
    }
}
