package collections;
class Parent{
    void m1()
    {
        System.out.println("parent");
    }
}
public class child extends Parent{
    @Override
    void m1() {
        System.out.println("Child1-p");
    }
    void m2(){
        System.out.println("child");
    }
    public static void main (String[]args){
        Parent obj = new child();
        obj.m1();
    }
}
