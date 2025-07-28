package interfaces;
// class to class --> extends
//class to interface --> implments
//interface to interface ---> extends
//class can implement multiple interfaces

interface  Computer
{
  void brand();
  void price();
}

class Laptop implements Computer
{
    public void brand() {
        System.out.println("brand is laptop brand");
    }

    public void price() {
        System.out.println("price is laptop price");
    }
}
class Desktop implements Computer
{

    @Override
    public void brand() {
        System.out.println("brand is desktop brand");
    }

    @Override
    public void price() {
        System.out.println("price is desktop price");
    }
}

class Developer
{
    public void work (Computer lap)
    {
        lap.brand();
    }
    public void workprice(Computer desk)
    {
        desk.price();
    }
}

public class Demo {

    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer dv = new Developer();
        dv.work(lap);
        dv.workprice(desk);
        //          lap.price();
    }
}
