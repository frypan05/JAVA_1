package LamdaExpressions;

interface i1
{
    void show();
}
public class LD1
{
    public static void main (String[] args)
    {
        System.out.println("Main class");
        i1 obj = new i1()
        {
            public void show()
            {
                System.out.println("Interface method"+"definition in anonymous class");
            }
        };
        obj.show();
    }
}