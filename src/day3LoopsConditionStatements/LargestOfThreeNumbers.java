package day3LoopsConditionStatements;
//Write a program that takes three numbers and prints the largest using if-else or switch.

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        LargestOfThreeNumbers LTN = new LargestOfThreeNumbers();
        LTN.ifElseMethod();
//        int largest = switchCondition();
//        System.out.println(largest);

    }

    public void ifElseMethod() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("a is largest number");
        } else if (b > c && b > a) {
            System.out.println("b is largest number");
        } else if (c > a && c > b) {
            System.out.println("c is largest number");
        } else if (a == b && b != c) {
            System.out.println("a and b are equal");
        } else if (b == c && b != a) {
            System.out.println("c and b are equal");
        } else if (a == b && b == c) {
            System.out.println("a,b,c are equal");
        }
    }

//    public static int switchCondition() {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int result = 0;
//        int comparison = Integer.compare(a, b);
//        switch (comparison) {
//            case 1:
//                result = (a >= b ? a : b);
//                break;
//            case 2:
//                result = (b >= c ? b : c);
//                break;
//            case 3:
//                result = (a == b && a != c ? a : c);
//                break;
//        }
//        return result;
//    }
}




