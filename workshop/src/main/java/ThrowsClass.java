public class ThrowsClass
{
    void method() throws ArithmeticException, NullPointerException
    {
        throw new NullPointerException();
    }
    public static void main (String [] args)
    {
        System.out.println("Before method call");
        ThrowsClass obj = new ThrowsClass();
        obj.method();
        System.out.println("After method call");
    }
}
