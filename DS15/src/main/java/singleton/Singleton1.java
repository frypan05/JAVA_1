package singleton;
class TajMahal1{
    static TajMahal1 obj = new TajMahal1();
    private TajMahal1()
    {
        System.out.println("accessed yay");
    }
    public static TajMahal1 getInstance()
    {
        return obj;
    }
}
public class Singleton1
{
    public static void main(String[] args)
    {
         //Tajmahal1 t1 = new TajMahal1();
        TajMahal1 t1 = TajMahal1.getInstance();
        TajMahal1 t2 = TajMahal1.getInstance();
    }
}
