package arrays;

public class SecondLargestArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 50, 40};
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Array doesn't have a second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}

