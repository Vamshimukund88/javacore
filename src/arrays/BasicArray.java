package arrays;

public class BasicArray {
    public static void main(String[] args)
    {
        int[] number = {1, 2, 3, 4, 5};
        String[] names = {"Vamshi","Mukund"};
        System.out.println(number.length);
        for (int i=0;i< names.length;i++){
            System.out.println(names[i]);
        }
        for (int num: number) {
            System.out.println(num);
        }
    }
}
