package classAndobjectday01;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Calc c= new Calc();
        int result = c.add(n1,n2);
        System.out.println(result);
    }
}
class Calc
{
    public int add(int n1,int n2)
    {
        System.out.println("Check the call of different class by creating Object");
        int r = n1+n2;
        return r;

    }
}
