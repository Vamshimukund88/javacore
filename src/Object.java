public class Object {

    public static void main(String[] args)
    {

      new A().show(); // Anonymous Object creation as it has no reference

    }
}

class A extends Object
{
    public A()
    {
        System.out.println("A constructor");
    }

    public void show()
    {
        System.out.println("show constructor");
    }
}
