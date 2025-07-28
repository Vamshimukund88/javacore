package arrays;

import java.util.Random;

public class MultiDimentionalArray1 {

    public static void main(String[] args) {
        int a[][] = new int[4][4];
        Random rand = new Random(100);
        int size = a.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j] = rand.nextInt(100);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
