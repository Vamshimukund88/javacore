package methodOverloading;

public class Main {

    public static void main(String[] args)
    {
        Calculator ref = new Calculator();
        System.out.println(ref.add(1,2,3));
        System.out.println(ref.add(2,3,8));
    }
}

class Calculator
    
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int add(int n1,int n2, int n3)
    {
        return n1+n2+n3;
    }
}
