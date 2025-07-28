package inheritance;

public  class Total
{
    public static void main(String[] args)
    {
        AdvCalc ac = new AdvCalc();
        System.out.println(ac.add(3,5));
        System.out.println(ac.sub(6,3));
        System.out.println(ac.div(10,2));
        System.out.println(ac.multi(10,2));


    }
}
class Calc{
        public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int sub(int n1,int n2)
    {
        return n1-n2;
    }
}


