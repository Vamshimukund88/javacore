package abstracts;

abstract class Parent
{
    public abstract void show(); // abstract class does not need implemented in abstract class
}
class Child extends Parent
{
    public void show()
    {
        System.out.println("in child Show");
    }
}

public class Demo {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}


