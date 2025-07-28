package arrays;

public class CheckArraySorted {
    public static void main(String[] args)
    {
        int[] numbers={23,3,1,33,45,654,6};

        boolean isSorted = true;

        for (int i=0;i<numbers.length-1;i++)
        {
            if(numbers[i]>numbers[i+1])
            {
                isSorted = false;
                break;
            }
        }

        if(isSorted==true) {
            System.out.println("Array is sorted");
        }else
        {
            System.out.println("Array is not sorted");
        }
    }
}
