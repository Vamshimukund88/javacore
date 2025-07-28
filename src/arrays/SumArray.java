package arrays;

public class SumArray {
    public static void main(String[] args)
    {
        int[] number = {1, 2, 3, 4, 5};
        int sum=0;
        for (int add: number)
        {
            sum+= add;
        }
        System.out.println(sum);

        int[] n = {2,3,4,5,2,5};

        for(int j : n)
        {
            System.out.println(j);
        }
    }


}
