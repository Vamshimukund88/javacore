package enums;

enum Laptop
{
    Mac(1000),// Mac --> these are called Objects
    Dell(600),
    HP(400),

    Alien();

    private int price;

    Laptop() {
        price = 200;
    }

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public boolean setPrice(int price) {
        this.price = price;
        return false;
    }
}

class Test
{


}
public class Demo {

    public static void main(String[] args)
    {
        Laptop l = Laptop.Mac;
        System.out.println(l.getPrice()+" is mac price");
        Laptop l1 = Laptop.HP;;
        System.out.println(l1.getPrice()+ " is HP price");

        for (Laptop lap : Laptop.values())
        {
            System.out.println(lap.name()+" : "+ lap.getPrice());
        }
    }
}
