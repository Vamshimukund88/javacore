package arrays;

public class MaxArray {
    public static void main(String[] args)
    {
        int[] number= {2,4,5,7,9,13,9};
        int max=0;
        for(int i=1;i< number.length;i++)
        {
            if(number[i]>max) {
                max = number[i];
            }
        }
        System.out.println(max);
    }
}
