package day3LoopsConditionStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchStatement {
  //Write a program that uses a switch statement to display the name of the day
    // based on the number (1 for Monday, 2 for Tuesday, etc.).

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
