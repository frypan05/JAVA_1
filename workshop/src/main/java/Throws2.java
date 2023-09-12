public class Throws2
{
    void method() throws ArithmeticException, NullPointerException
    {
        throw new NullPointerException();
    }
    public static void main (String [] args)
    {
        System.out.println("Before method call");
        ThrowsClass obj = new ThrowsClass();
        try{
            obj.method();
        }
        catch (RuntimeException e)
        {
            System.out.println("E: "+e);
        }
        System.out.println("After method call");
    }
}