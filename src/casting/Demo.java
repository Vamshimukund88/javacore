package casting;

public class Demo {
    public static void main(String[] args)
    {
        A obj = (A) new B();// up casting , this also works: A obj = new B();
        obj.show1();

        B obj1 = (B) obj;// down casting
        obj1.show2();
    }
}
class A
{
    public void show1()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    public void show2()
    {
        System.out.println("in B show");
    }
}