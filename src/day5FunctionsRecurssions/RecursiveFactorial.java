package day5FunctionsRecurssions;

public class RecursiveFactorial {

    public static int factorial(int n)
    {
        if(n==0)
            return 1;
        else
        return n * (n-1);
    }
    public static void main(String[] args)
    {
        int value=factorial(100);
        System.out.println(value);
    }
}
