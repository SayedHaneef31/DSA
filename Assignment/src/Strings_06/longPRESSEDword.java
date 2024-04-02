package Strings_06;

import java.util.*;
public class longPRESSEDword
{
    public static void main(String[] args)
    {

                String name="leelee";
                String typed="lleeelee";
                int k=0;
                for(int i=0;i<name.length();i++)
                {
                    char ch=name.charAt(i);
                    int flag=0;
                    for(int j=k;j<typed.length();)
                    {
                        char ch1=typed.charAt(j);
                        if(ch==ch1)
                        {
                            flag=1;
                            k=j++;
                        }
                        else
                        {
                            k=j;
                            break;
                        }
                    }
                    if(flag==0)
                        System.out.println("FALSE");
                }
       // System.out.println("TRUE");

        }
    }

