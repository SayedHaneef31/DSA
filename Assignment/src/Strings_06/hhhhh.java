package Strings_06;
import java.util.*;

public class hhhhh
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "world hel20";
        s = s + " ";
        String str = "";
        String p = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ')
                p = p + ch;
            else {
                String ptr = "";
                for (int j = 0; j < p.length(); j++) {
                    char ch1 = p.charAt(j);
                    if (Character.isDigit(ch1)) {
                        for (int k = 1; k < Character.getNumericValue(ch1); k++) {
                            ptr = ptr + p.charAt(j - 1);
                        }

                    } else
                        ptr = ptr + ch;
                }
                str = ptr + str + " ";
                ptr = "";
                p = "";
            }
        }
        System.out.println(str.trim());

    } }