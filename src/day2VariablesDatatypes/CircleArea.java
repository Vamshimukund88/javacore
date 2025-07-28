package day2VariablesDatatypes;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double Area;
        double r=sc.nextDouble();
        Area= Math.PI*Math.pow(r,2);
        System.out.println("area of circle is: "+Area);
    }
}
