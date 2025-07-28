package day3LoopsConditionStatements;

public class DoWhileLoop {
    public static void main(String[] args) {
        int n = 0;      // First Fibonacci number
        int n1 = 1;     // Second Fibonacci number
        int count = 0;  // Counter for the number of Fibonacci numbers printed

        // We want to print the first 10 Fibonacci numbers
        do {
            System.out.println(n);  // Print the current Fibonacci number
            int fib = n + n1;  // Calculate the next Fibonacci number
            n = n1;             // Update the value of n to n1 (previous Fibonacci number)
            n1 = fib;           // Update the value of n1 to the new Fibonacci number
            count++;            // Increment the count of printed Fibonacci numbers
        } while (count < 10);  // Print exactly 10 Fibonacci numbers
    }
}
