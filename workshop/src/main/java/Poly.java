//overloading
public class Poly
{
    void method1()
    {
        System.out.println("Method1 without args");
    }
    void method1(int a)
    {
        System.out.println("Method1 with arg 1"+a);
    }
    void method1(int a,int b)
    {
        System.out.println("Method1 with arg 1"+a+", arg 2"+b);
    }
    public static void main(String[] args)
    {
        Poly obj = new Poly(); //compile time polymorphism
        obj.method1();
        obj.method1(1);
        obj.method1(2, 3);

    }
}

