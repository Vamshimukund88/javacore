package arrays;

import java.util.Random;

public class JaggedArray {
    public static void main(String[] args)
    {
        int a[][] = new int[4][];
        a[0]= new int[4];
        a[1]= new int[3];
        a[2]= new int[2];
        a[3]=new int[1];
        Random rand = new Random(100);
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j] = rand.nextInt(100);
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
