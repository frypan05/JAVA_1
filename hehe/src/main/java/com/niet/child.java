package com.niet;
class Parent
{
    static void method1()
    {
        System.out.println("parent static method1");
    }
    void method2()
    {
        System.out.println("parent instance method2");
    }
}
public class child extends Parent{

    static void method3()
    {
        System.out.println("child1 static method3");
    }
    void method4()
    {
        System.out.println("child1 instance method4");
    }
    public static void main(String[] args)
    {
        method3();
        method1();
        child2.method5();
        child2 obj = new child2();
        obj.method6();
        obj.method2();
        child obj2= new child();
        obj2.method4();
        obj2.method2();
    }
}
class child2 extends Parent{
    static void method5()
    {
        System.out.println("child2 static method5");
    }
    void method6()
    {
        System.out.println("child2 instance method6");
    }

}