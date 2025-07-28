package constructors;

public class LearnConstructor {

    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public LearnConstructor()
    {
        age = 14;
        name = "James";
    }
    public LearnConstructor(int age,String name)
    {
        this.age = age;
       this.name = name;
    }

    public static void main(String[] args)
    {
        LearnConstructor lc = new LearnConstructor();
        System.out.println("Name is: "+ lc.name +" Age: "+lc.age);
        LearnConstructor lc1 = new LearnConstructor(20,"Vicky");
        System.out.println("Name is: "+ lc1.name +" Age: "+lc1.age);

    }

}
