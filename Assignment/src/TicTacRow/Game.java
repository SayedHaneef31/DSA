//package TicTacRow;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//
//1. table banaao
//2. khaali initialize karo use
//3. input lo from player 1 nd 2
//4. coordinates leke uski validityy check kro and
//
//public class Game
//{
//    static Scanner s=new Scanner(System.in);
//    public static void main(String[] args)
//    {
//        Scanner sc= new Scanner(System.in);
//        char table[][]=new char[3][3];
//        //char tt[][]={{'a','b','c'},{'d','e','f'},{'g','h','i'}};
//        //printtt(table);
//        boolean gameOver=false;
//        int n=2;
//        //System.out.println(Arrays.toString(inputtt(1,table)));
//        while(!gameOver)
//        {
//            printtt(table);
//            if(n==2)
//            {
//                int chance[]=inputtt(--n,table);
//            }
//
//            //Checking for rows
//            for (int i = 0; i < 3; i++)
//            {
////                if(n==1)
//
//
//
//            }
//
//
//
//
//
//
//        }
//
//    }
////    static boolean gameKhatam()
//    static void inputtt(int n,char[][] table)
//    {
//
//        boolean valid=true;
//        while (valid)
//        {
//            System.out.println((n==1)? "Enter player 1:" : "Enter player 2:");
//            int x= s.nextInt();
//            int y= s.nextInt();
//            if(validity(x,y,table)) ;
//            else System.out.println("Invalid Choice!! Enter again");
//
//
//        }
//
//
//    }
//    static void printtt(char[][] table)
//    {
//        for (int i = 0; i <3 ; i++)
//        {
//            for (int j = 0; j < 3; j++)
//            {
//                System.out.print(table[i][j]);
//                if(j<=1) System.out.print(" | ");
//
//            }
//            System.out.println();
//            if(i<=1) System.out.println("_________");
//        }
//    }
//    static boolean validity(int ii,int jj,char[][] table)
//    {
//        if (ii>2 || ii<0) return false;
//        if (jj>2 || jj<0) return false;
//        if(table[ii][jj]=='X' || table[ii][jj]=='0') return false;
//        return true;
//
//
//    }
//}
