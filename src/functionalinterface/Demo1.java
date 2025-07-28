package functionalinterface;

interface AB
{
    public void show();
}
public class Demo1 {

    public static void main(String[] args)
    {
        AB obj = new AB()
        {
            @Override
            public void show() {
                System.out.println("Anonymous Inner Class Priinting");
            }
        };
    }
}

