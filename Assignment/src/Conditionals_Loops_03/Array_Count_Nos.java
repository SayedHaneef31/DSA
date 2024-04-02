package Conditionals_Loops_03;
//Write a program to print the sum of negative numbers,
// sum of positive even numbers and the sum of positive odd numbers
// from a list of numbers (N) entered by the user. The list
// terminates when the user enters a zero.

import java.util.*;
public class Array_Count_Nos
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i=0;int temp;
        ArrayList<Integer> a= new ArrayList<Integer>();
        //ArrayList<int> a = new ArrayList<int>();
        System.out.println("Enter the list of the numbers and write 0 when u want to finish the list,OKK??");
        do
        {
            if(i==0)
                System.out.println("Now Enter a no. ");
            else
                System.out.println("Any more?");
            temp=sc.nextInt();
            if(temp!=0)
            {
                a.add(temp);
            }
            i++;
        } while(temp!=0);
        /*
        for (int j = 0; j < a.size(); j++)  ..........WAS JUST CHECKING WHETHER IT WAS PRINTING OR NOT
        {
            System.out.println(a.get(j));
        }
        lwwkhfw
        kheehflkewf
        .khf
        */
        int spe=0,spo=0,sn=0,n;
        for (i=0;i<a.size();i++) {
            n = a.get(i);
            if (n < 0)
                sn = sn + n;
            else {
                if (n % 2 == 0) {
                    // System.out.println("i am in even condition");

                            spe = spe + n;
                } else //wuwjlwlfweilfwfjhewhfiewfi
                    spo = spo + n;
            }
        }
        System.out.println("Sum of Negative Number= "+sn);
        System.out.println("Sum of Positive Even no.= "+spe);
        System.out.println("Sum of Positive Odd no.= "+spo);
    }
}

