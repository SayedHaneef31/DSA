interface AA
{
    void show();

}
interface BB
{
    void showwww();
    void config();
}
class Haneef implements AA,BB
{


    @Override
    public void show() {
        System.out.println("In show");
    }

    @Override
    public void showwww() {
        System.out.println("In showwwww");

    }

    @Override
    public void config() {
        System.out.println("in config");


    }

    public static void main(String[] args)
    {


    }
}
