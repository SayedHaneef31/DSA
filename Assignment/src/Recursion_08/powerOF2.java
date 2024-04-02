package Recursion_08;

public class powerOF2 {
    public static void main(String[] args) {
        int n = 16;
        if (n == 1) {
            System.out.println("TRUE");
            System.exit(0);
        }

        if (n % 2 == 1) {
            System.out.println("FALSE");
            System.exit(0);
        }


        int flag = 0;
        for (int i = n; i >= 1; i /= 2) {
            if (i % 2 == 0)
                continue;
            else {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            System.out.println("TRUE");
        else System.out.println("FALSE");

    }
}

//}
//            static boolean check(int n)
//            {
//                if(n==1)
//                    return true;
//                if(n%2==0)
//                    return check(n/2);
//                else
//                    return false;
//            }
//        }
