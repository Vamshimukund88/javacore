package day2VariablesDatatypes;

public class TypeCastingExplicit {
    public static void main(String[] args)
    {
        TypeCastingExplicit TE = new TypeCastingExplicit();

        TE.explicitDoubleToInt();
        TE.explicitIntToChar();
    }
    public void explicitDoubleToInt()
    {
        double a =100.0;
        int intDouble = (int)a;
        System.out.println(intDouble);
    }

    public void explicitIntToChar()
    {
        int a= 100;
        char charInt = (char)a;
        System.out.println(charInt);
    }
}
