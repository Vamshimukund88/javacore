package accessmodifiers;

class A {
    public void show() // IF:  public final void show() ----> no other method with same name show() can be inherited
    {
        System.out.println("in show A class");
    }
}


class B extends A
{
    public void show()
    {
        super.show();
        System.out.println("in show B class");
    }
}
