package LinkedList_15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JosephProblem
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> arr=new ArrayList<>();
        int n=15;
        int k=2;

//        arr.add(5);
//        arr.add(6);
//        arr.add(7);
//        arr.add(8);
//        arr.add(9);
//        arr.add(10);
//        printList(arr);
        for (int i = 1; i <=6 ; i++)
        {
            arr.add(i);
        }
        System.out.println(removeKro((ArrayList<Integer>) arr,k,0));

    }

    private static int removeKro(ArrayList<Integer> arr, int k, int pos)
    {
        if(arr.size()==1)
        {
            return arr.get(0);
        }

        int r=(pos+k)% arr.size();
        arr.remove(r);
//        pos=k;
        return removeKro(arr,k,pos+k);
    }

    public static void printList(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i) + " ");
        }
    }

}
