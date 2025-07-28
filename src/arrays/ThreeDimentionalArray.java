package arrays;

import java.util.Random;

public class ThreeDimentionalArray {
    public static void main(String[] args)
    {
        int a[][][] = new int[4][4][4];
        Random rand = new Random(100);
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                for(int k=0;k<a[i][j].length;k++)
                {
                    a[i][j][k] = rand.nextInt(100);
                    System.out.print(a[i][j][k]+ " ");
                }
                System.out.println();
            }
            System.out.println("------------ Layer " + i + " ------------");
        }

    }
}
