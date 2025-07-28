package staticblock;

public class StaticTest01 {

    public static void main(String[] args) throws ClassNotFoundException {
        nonStatic ns = new nonStatic();//Object creation & ns is object reference

        ns.id = 20;
        ns.name = "vamshi";
        // static variable should be called using class name
      //  nonStatic.surname = "Mukund";

        nonStatic ns1 = new nonStatic();
        ns1.id = 22;
        ns1.name = "Shravan";
       // nonStatic.surname = "Mukund";

        ns.printNonStaticVariables();
        ns1.printNonStaticVariables();

        Class.forName("staticblock.nonstatic2");
    }
}
class nonStatic
{
    String name;
    int id;

    static String surname;

    static
    {
        surname = "Mukund";// if u initialize here, you will reduce redundacy of calling "SURNAME" mutiple times like above
        System.out.println("Static block");
    }

    nonStatic()
    {
        System.out.println("Constructor");
    }

    public void printNonStaticVariables()
    {
        System.out.println(name+ " :"+surname +" "+ +id +"  ");
    }
}
class nonstatic2
{
    static
    {
        System.out.println("nonstatic2 block class");
    }
}
