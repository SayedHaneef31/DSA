package Functions_04;
//Write a function that returns all prime numbers between two given numbers.

import java.util.*;
public class Prime_Function {
    static int prime(int a) {

        int c = 0;
        for (int j = 1; j <= a; j++) {
            if (a % j == 0) c++;
        }
        if (c == 2) return a;
        else return 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = x; i <= y; i++)
        {
            int check = prime(i);
            if (check != 0)
                System.out.println(check);

        }
    }
}
