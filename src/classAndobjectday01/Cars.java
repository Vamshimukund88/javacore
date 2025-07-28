package classAndobjectday01;
//Methods
public class Cars {

    public static void main(String[] args)
    {
        Engine eng = new Engine();// Creating Object
        eng.runEngine();
        String seatResult = eng.seats(1);
        System.out.println(seatResult);

    }
}

class Engine
{
    public String runEngine()
    {
        System.out.println("Engine is build");
        return "EngineON";
    }
    public String seats(int seatCount)
    {
        if(seatCount >=2 )
        {
            return "Seats are more than 2";
        }
        return "no passenger seats available";
    }

}
