package staticblock;

// Question: Call nonstatic method in static main method.
// Can be called with object creation, other way is to initialize object in method calling:  public static void method2(NonStaticMethod obj)
//when u do this, you can call any object when u wanted to call method2 in main method: nsm1.method2(nsm);
//       nsm1.method2(nsm1);

public class StaticNonStaticDifferMethod {

    public static void main(String[]args)
    {
        NonStaticMethod nsm = new NonStaticMethod();
        nsm.rollno=10;
        nsm.method1();

        NonStaticMethod nsm1 = new NonStaticMethod();
        nsm1.rollno=12;
        nsm1.method2(nsm);
       nsm1.method2(nsm1);

    }
}
class NonStaticMethod
{
    int rollno;
    static String name ;

    static
    {
        name = "Mukund";
        System.out.println("Static block");
    }

    public void method1()
    {
        System.out.println(name+ " "+ rollno +" ");
    }

    public static void method2(NonStaticMethod obj)
    {
        System.out.println(name+ " "+ obj.rollno +" ");
    }


}
