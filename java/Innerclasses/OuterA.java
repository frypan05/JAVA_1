package Innerclasses;
public class OuterA
{
    static void methodA()
    {
        abstract class Z
        {
            abstract void m1();
            static void m2()
            {
                System.out.println("Non-abstract method in Z");
            }
        }
        class InnerA
        {
            void m1()
            {

            }
            void InnerA()
            {
                System.out.println("Inner A");
            }
        }
        InnerA obj = new InnerA();
        obj.InnerA();
        obj.m1();
        Z.m2();
    }

}
