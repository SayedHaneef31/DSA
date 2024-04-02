package First_JAVA_02;

import java.util.Scanner;

public class SaatvikMaam
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age;
        double salary;
        String name= "";
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter age and salary");
        age=sc.nextInt();
        salary=sc.nextDouble();

        System.out.println("Name="+name+"\tAge="+age+"\tSalary="+salary);
    }
}
