package TicTacRow;
import java.util.*;
public class Game
{
    static int c=0;
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        char table[][]=new char[3][3];
        for (int i=0;i<3;i++)    //initialising empty matrix
        {
            for (int j = 0; j < 3; j++)
            {
                table[i][j]=' ';
            }
        }

        System.out.println("Welcome to the Tic-Tac-Toe Game");

//        int c=0;
        boolean gameOver=false;
        int n=1;
        while(!gameOver)
        {
            printtt(table);
            if(n==1)
            {
                System.out.println("Enter player 1");
                inputtt(1,table);
                n++;

            }
            else
            {
                System.out.println("Enter player 2");
                inputtt(2,table);

                n--;
            }

            gameOver=gameKhatam(table);
        }
        printtt(table);


    }
    static boolean gameKhatam(char[][] table)
    {
        c++;
        if (c>=9)
        {
            System.out.println("Laude ache se khell!!! ");
            return true;

        }

        if((table[0][0]=='X' && table[1][1]=='X' && table[2][2]=='X') || (table[0][2]=='X' && table[1][1]=='X' && table[2][0]=='X'))
        {
            System.out.println("Player 1 Won.. Cheers!!");
            return true;

        }
        if ((table[0][0]=='0' && table[1][1]=='0' && table[2][2]=='0') || (table[0][2]=='0' && table[1][1]=='0' && table[2][0]=='0'))
        {
            System.out.println("Player 2 Won.. Cheers!!");
            return true;

        }

        int thrice1=0;
        int thrice2=0;
        int thrice11=0;
        int thrice22=0;
        for (int i = 0; i <3 ; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if(table[i][j]=='X')
                    thrice1++;
                if (table[i][j]=='0')
                    thrice2++;
                if(table[j][i]=='X')
                    thrice11++;
                if (table[j][i]=='0')
                    thrice22++;

            }
            if(thrice1==3 || thrice11==3)
            {
                System.out.println("Player 1 Won");
                return true;
            }
            if(thrice2==3 || thrice22==3)
            {
                System.out.println("Player 2 Won");
                return true;
            }
            thrice1=0;
            thrice2=0;
            thrice11=0;
            thrice22=0;


        }

        return false;
    }
    static void inputtt(int n,char[][] table)
    {
        boolean valid_Choice=true;
        while(valid_Choice)
        {
            char chh;
            int x= s.nextInt();
            int y= s.nextInt();
            if(validity(x,y,table))
            {
                if(n==1)
                    chh='X';
                else
                    chh='0';
                table[x][y]=chh;
                valid_Choice=false;
            }
            else
                System.out.println("Invalid Choice!! Enter again");
        }

    }
    static void printtt(char[][] table)
    {
        for (int i = 0; i <3 ; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(table[i][j]);
                if(j<=1) System.out.print(" | ");
            }
            System.out.println();
            if(i<=1) System.out.println("_________");
        }
        System.out.println();System.out.println();
    }
    static boolean validity(int ii,int jj,char[][] table)
    {
        if (ii>2 || ii<0) return false;
        if (jj>2 || jj<0) return false;
        if(table[ii][jj]=='X' || table[ii][jj]=='0') return false;
        return true;


    }
}
