package encapsulation;

public class Human {

    public static void main(String[]args)
    {
        Biodata bd = new Biodata();
        bd.setAge(30);
        bd.setName("Vamshi");
        bd.printName();
    }
}
class Biodata
{
    private int age;
   private String name;

    public int getAge()
    {
       return age;
    }
    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void printName()
    {
        System.out.println(name+" "+age);
    }


}
