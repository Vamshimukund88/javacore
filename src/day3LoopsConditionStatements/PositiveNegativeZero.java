package day3LoopsConditionStatements;

import java.util.Scanner;

//Write a program that checks whether a number is positive, negative, or zero using if-else
public class PositiveNegativeZero {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0)
        {
            System.out.println("Positive");
        }else if(n<0)
        {
            System.out.println("Negative");
        }else
        {
            System.out.println("Zero");
        }
    }
}
