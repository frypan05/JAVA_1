class Outer
{
    int a=10;
    void outerMethod1()
    {
        System.out.println("Instance outer method1");
    }
    static void outerMethod2()
    {
        System.out.println("static outer method2");
    }
    class Inner
    {
        void innerMethod1()
        {
            System.out.println("instance inner method1");
        }
        static void innerMethod2()
        {
            System.out.println("static inner method2");
        }
    }
}

public class NormalInnerClass
{
    public static void main()
    {
        Outer obj = new Outer();
        obj.outerMethod1();
        Outer.outerMethod2();
        Outer.Inner obj2=obj.new Inner();
        obj2.innerMethod1();
        obj2.innerMethod2();
        Outer.Inner obj3 = new Outer().new Inner();
    }
}
