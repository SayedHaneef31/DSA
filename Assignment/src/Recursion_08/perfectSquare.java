package Recursion_08;
import java.util.*;
public class perfectSquare
{
    public static void main(String[] args)
    {
        System.out.println(numSquareHelper(13)-1);


    }

    static int numSquareHelper(int n)
    {
        if(n == 0) return 1;
        if(n < 0) return 0;
        int ans = Integer.MAX_VALUE;
        int i = 1;
        int end = (int) Math.sqrt(n);
        while(i <= end) {
            int perfectSquare = i * i;
            int numberOfPerfectSquares = 1 + numSquareHelper(n - perfectSquare);
            if (numberOfPerfectSquares < ans) {
                ans = numberOfPerfectSquares;
            }
            ++i;
        }
        return ans;
    }

}
