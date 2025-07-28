package strings;

public class String01 {

    public static void main(String[] args)
    {
        String name = "Vamshi";

        System.out.println(name);

        System.out.println("Mukund "+name);
        //Concat
        System.out.println(name.concat(" Mukund"));
        System.out.println("Mukund".concat(name));
        //use charAt()
        System.out.println(name.charAt(2));
    }

}
