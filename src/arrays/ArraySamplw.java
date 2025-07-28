package arrays;

import java.util.Random;

public class ArraySamplw {

    public static void  main(String[] args)
    {
        int a1[] = {2,1,3,4,5,6};
        int a2[] = new int[3];

        for(int a : a1)
        {
            System.out.print(a);
        }
        System.out.println();
        Random rand  = new Random();

        for(int i=0; i<a2.length;i++)
        {
            a2[i] = rand.nextInt(10);
          //  System.out.print(a2[i]);
        }
    }
}
