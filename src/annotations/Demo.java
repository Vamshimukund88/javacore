package annotations;

public class Demo {
    public static void main(String[] args)
    {
        B obj =  new B();
        obj.showTheMethods();
    }


}
class A
{
    public void showTheMethods()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    @Override
    public void showTheMethods()
    {
        System.out.println("in B show");
    }
}
