
interface Parent1Interface
{
    void InterfaceMethod1();
    void InterfaceMethod2();
}
public class InterfaceClass
{
    public void InterfaceMethod1()
    {
        System.out.println("Interface methods are defined in child/derived/base classes");
        System.out.println("Interface methods definition: access modifier should be public");
        System.out.println("object references are not created for interface");
    }
    public void InterfaceMethod2()
    {
        System.out.println("Interface methods are defined in child/derived/base classes");
    }
    public static void main(String[] args)
    {
        InterfaceClass obj = new InterfaceClass();
        obj.InterfaceMethod1();
        obj.InterfaceMethod2();
    }
}
