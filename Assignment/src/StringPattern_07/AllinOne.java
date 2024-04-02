package StringPattern_07;

import java.util.*;
public class AllinOne {
    public static void main(String[] args) {
        int n = 15;
        //pattern12(n);
        pattern12(n);

    }

    static void pattern18()
    {
                                                                                                    //      **********   0
                                                                                                    //      ****  ****   2
                                                                                                    //      ***    ***   4
                                                                                                    //      **      **   6
                                                                                                    //      *        *   8
                                                                                                    //      *        *   8
                                                                                                    //      **      **   6
                                                                                                    //      ***    ***
                                                                                                    //      ****  ****
                                                                                                    //      **********
        int sp=0;
        for (int i = 1; i <=10 ; i++)
        {
            for (int j = 1; j <=10 ; j++)
            {
                for (int k = 1; k <=i ; k++)
                {


                }

            }
            if(i==5 || i==6) sp=8;
            else if (i<5)  sp+=2;
            else if (i>6)  sp-=2;

        }
    }
    static void pattern17()
    {
                                                                                                                //                 1
                                                                                                                //                212
                                                                                                                //               32123
                                                                                                                //              4321234
                                                                                                                //               32123
                                                                                                                //                212
                                                                                                                //                 1
        int sp=4;int k=1;
        for (int i = 1; i <=7 ; i++)
        {
            int temp_sp= (i<=5) ? --sp : ++sp;
            for (int space = 1; space<= temp_sp; space++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <=k ; j++)
            {

            }
            k=(i<4) ? k+2 : k-2;
        }

    }
    static void pattern16()                             //DOUBT
    {
                                                                                            //              1
                                                                                            //            1   1
                                                                                            //          1   2   1
                                                                                            //        1   3   3   1
                                                                                            //      1   4   6   4   1


    }
    static void pattern15(int n)
    {
        //         *
        //        * *
        //       *   *
        //      *     *
        //     *       *
        //      *     *
        //       *   *
        //        * *
        //         *
        int k=5;int temp=1;
        for (int i = 1; i <=9 ; i++)
        {
            int temp_sp= (i<=5) ? --k : ++k;
            for (int space = 1; space<= temp_sp; space++)
            {
                System.out.print(" ");
            }

            for (int j = 0; j <=temp ; j++)
            {
                if (j==1 || j==temp) System.out.print("*");
                else System.out.print(" ");

            }
            temp=(i<5) ? temp+2 : temp-2;
            System.out.println();
        }

    }
    static void pattern13(int n)
    {
        //         *
        //        * *
        //       *   *
        //      *     *
        //     *********
        int k=1;int temp_sp=n-1;
        for (int i = 1; i <=n; i++)
        {
            for (int space = 1; space<= temp_sp; space++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <=k ; j++)
            {
                if(i==n)
                    System.out.print("*");
                else if (j==1 || j==k)
                {
                    System.out.print("*");
                }
                else System.out.print(" ");

            }
            k=k+2;
            temp_sp--;
            System.out.println();
        }
    }
    private static void pattern12(int n)
    {

                                                                                            //     * * * * *
                                                                                            //      * * * *
                                                                                            //       * * *
                                                                                            //        * *
                                                                                            //         *
                                                                                            //         *
                                                                                            //        * *
                                                                                            //       * * *
                                                                                            //      * * * *
                                                                                            //     * * * * *
        int k=n;int k2=2*n-1;
        for (int i = 1; i <=2*n+1 ; i++)
        {
            int temp_sp= (i<=n) ? i-1 : k--;
            if(i!=n+1)
            for (int space = 1; space <=temp_sp ; space++)
            {
                System.out.print(" ");
            }
            //int temp_col= k2;
            for (int j = 1; j <=k2; j++)
            {
                if (j % 2 == 1) System.out.print("*");
                else System.out.print(" ");

            }
            if(i!=n+1)
            System.out.println();
            if(i<=n) k2-=2;
            else k2+=2;

        }

        }
    private static void pattern11(int n)
    {
                                                                                //     * * * * *
                                                                                //      * * * *
                                                                                //       * * *
                                                                                //        * *
                                                                                //         *
        int k=2*n-1;
        for (int i =1 ; i <=n ; i++)
        {
            for (int space = 1; space <i ; space++)
            {
                System.out.print(" ");
            }
            for (int j = k; j >=0 ; j--)
            {
                if(j%2==1) System.out.print("*");
                else System.out.print(" ");

            }
            k-=2;
            System.out.println();
        }
    }
    private static void pattern8(int n)
    {
                                                                                                //        *
                                                                                                //       ***
                                                                                                //      *****
                                                                                                //     *******
                                                                                                //    *********
        int k=1;
        for (int i = 1; i <=n ; i++)
        {
            for (int space = 1; space <=n-i ; space++)
            {
                System.out.print(" ");
            }


            for (int j = 1; j<=k ; j++)
            {
                System.out.print("*");

            }
            k=k+2;
            System.out.println();
        }
    }
    static void pattern5(int k)
    {
    //    *
    //    **
    //    ***
    //    ****
    //    *****
    //    ****
    //    ***
    //    **
    //    *
        int temp=k;
        for (int i = 1; i < 2 * k; i++)
        {

        int col = (i <= k) ? i :--temp ;
        for (int j = 1; j <= col; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    }
    private static void pattern2(int n)
    {
        //    *****
        //    ****
        //    ***
        //    **
        //    *
        for (int i = 1; i <=n ; i++)
        {
            for (int j = n; j >=i ; j--)
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    static void pattern3()
    {
        //                    *****
        //                    ****
        //                    ***
        //                    **
        //                    *
        int k = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = k; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
            k--;
        }
    }

}
