package innerclass;


// inner class means class within class as show below: B is inside A class. Also to print methods from B, it should be static and A.B is how we create an object


class A
{
    public void show()
    {
        System.out.println("in show");
    }
    static class B
    {
        public void config()
        {
            System.out.println("in config B class");
        }
    }
}
public class Demo {
    public static void main(String[] args)
    {
        A obj = new A();
        obj.show();
        A.B obj1 = new A.B();
        obj1.config();
    }
}
