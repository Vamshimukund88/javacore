package functionalinterface;

interface ABC
{
    public void show(int x);
}
public class Demo3 {

    public static void main(String[] args)
    {
        // Using lambda expression
        ABC obj = (int x) ->
                System.out.println("Anonymous Inner Class Priinting: "+x);
        obj.show(5);
    }
}

