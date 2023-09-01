//in same class you cannot call a method, it will give an error
public class Overriding
{
    void methodA()
    {
        System.out.println("MethodA -1");
    }
    void methodA()
    {
        System.out.println("MethodA -12");
    }
    public static void main(String[] args)
    {
        Overriding obj = new Overriding();
        obj.methodA();
    }
}
