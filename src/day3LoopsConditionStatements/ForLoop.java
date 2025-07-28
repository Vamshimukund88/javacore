package day3LoopsConditionStatements;
//Write a program that calculates the sum of all numbers from 1 to 100 using a for loop.
public class ForLoop {
    public static void main(String[] args)
    {
        int result = 0;
        for(int i=1;i<=100;i++)
        {
            result = result + i;
            System.out.println(result);
        }
    }
}
