package Threading;
class A extends Thread
{
    public void run() {
        for (int i = 0; i <= 100; i++)
            System.out.println(currentThread());
    }
}
class B extends Thread
{
    public void run()
    {
        for (int i=0;i<=100;i++)
        
            System.out.println(currentThread().getName());
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("e"+e);
        }
    }
}
public class Delete1
{
    public static void main (String[] args)
    {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();
    }
}
