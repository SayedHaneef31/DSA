
class A
{

    public void show()
    {
        for(int i=1;i<=3; i++)
        {
            System.out.println("hi");
        }
    }
}
class B extends A
{

    public void show()
    {
        for(int i=1;i<=3; i++)
        {
            System.out.println( "hello");
        }
    }
}
class HelloWorld {
    public static void main(String[] args)
    {
        A obj=new A();
        obj.show();
        System.out.println("Try programiz.pro");
    }
}