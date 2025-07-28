package day1Declarations;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        int a = 40, b = 40;
        if (a > b) {
            System.out.println("max number is a:" + a);
        } else if(b>a){
            System.out.println("max number is b:" + b);
        }else
        System.out.println("both values are equal");
    }
}
