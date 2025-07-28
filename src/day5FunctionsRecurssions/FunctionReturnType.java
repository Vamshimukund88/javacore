package day5FunctionsRecurssions;

public class FunctionReturnType {

    public static String sayBye(String name)
    {
        return name;
    }
    public static void main(String[] args)
    {
        String value=sayBye("Holo");
        System.out.println(value);
    }
}
