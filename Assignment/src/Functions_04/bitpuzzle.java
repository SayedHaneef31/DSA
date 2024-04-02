package Functions_04;
interface BaseI {void method();}

class BaseC
{
    public void method()
    {
        System.out.println("Inside BaseC::method");
    }
}
class bitpuzzle extends BaseC implements BaseI
{
    public static void main(String[] args)
    {
        (new bitpuzzle()).method();

    }
}
