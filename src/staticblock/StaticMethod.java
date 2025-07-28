package staticblock;

public class StaticMethod {

    public static void main(String[] args)
    {
        Test.StaticMethodChildClass();

    }
}

class Test
{

    int num = 10;
   static String name1 = "Bond";
    public static void StaticMethodChildClass()
    {
        System.out.println(name1);
    }

}
