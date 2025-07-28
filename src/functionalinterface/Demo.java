package functionalinterface;

interface A
{
    public void show();
}

class B implements A
{
    @Override
    public void show() {
        System.out.println(" class B ");
    }
}
public class Demo {

    public static void main(String[] args)
    {
        A obj = new B();
        obj.show();
    }
}
