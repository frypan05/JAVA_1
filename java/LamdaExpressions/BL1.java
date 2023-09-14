package LamdaExpressions;
@FunctionalInterface
interface i6{
    void m1();//instance abstract
}
public class BL1  {
    public static void main(String[] args)
    {
        i6 obj = new i6()
        {// Anonymous class
            public void m1()
            {
                System.out.println("abstract method in "
                        + "interface defined through "
                        + "Anonymous class");
            }

        };
        obj.m1();

    }
}
