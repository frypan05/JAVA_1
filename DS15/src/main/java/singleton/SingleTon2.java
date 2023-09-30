package singleton;
class ABC
{
    static ABC obj;
    private ABC()
    {
        System.out.println("You did it man well done");
    }
    public static ABC getInstance()
    {
        if (obj == null)
            obj = new ABC();
        return obj;
    }
}
public class SingleTon2
{
    public static void main(String[] args) {
        ABC obj1 = ABC.getInstance();
        ABC obj2 = ABC.getInstance();
    }
}