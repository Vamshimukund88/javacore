package arrays;

public class ReverseArray {
    public static void main(String[] args)
            //Reverse an Array
    {
        int[] array={1,3,6,8,9,10};
         int left = 0;
         int right=array.length-1;
         while (left<right)
         {
             int temp = array[left];
             array[left]=array[right];
             array[right]=temp;
             left++;
             right--;
         }
        for (int num:array)
        {
            System.out.print(num+  "  ");
        }

    }
}
