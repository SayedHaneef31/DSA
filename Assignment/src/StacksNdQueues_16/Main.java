package StacksNdQueues_16;
import java.util.*;


public class Main extends StacksMethods
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> str=new Stack<>();
        str.push(2);
        str.push(889);
        str.push(16);

        str.push(224);
        System.out.println(str.toString());
        System.out.println(str);
        //insert(str,9);
        //sortInsert(str,6);
        sort(str);
        System.out.println(str);
    }
}
