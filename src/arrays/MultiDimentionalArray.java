package arrays;

import java.util.Random;

public class MultiDimentionalArray {
    public static void main(String[] args)
    {
        int a[][] = new int[4][3];
        Random rand = new Random(10);



        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j] = rand.nextInt(10);
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
