package functionalinterface;

interface ABCD
{
    public int add(int x,int y);
}
public class Demo4 {

    public static void main(String[] args)
    {
        // Using lambda expression
        ABCD obj = (x,y) -> x+y;
        int r = obj.add(10,29);
        System.out.println(r);
    }
}

