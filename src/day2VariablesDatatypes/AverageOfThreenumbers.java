package day2VariablesDatatypes;

import java.util.Scanner;

public class AverageOfThreenumbers {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        double a=obj.nextDouble();
        double b=obj.nextDouble();
        double c=obj.nextDouble();;
        double avg= (a+b+c)/3;
        System.out.println(avg);

    }
}
