package intt;
public class checkfinalize {
    public static int count = 0;
    public checkfinalize()
    {
        count++;
        System.out.println("after  obj");
        System.out.println(count);

    }
    public static void main(String[] main){
        System.out.println("checkfinalizer");
        checkfinalize c1 = new checkfinalize();
        checkfinalize c2 = new checkfinalize();
        checkfinalize c3 = new checkfinalize();
        Runtime rs = Runtime.getRuntime();
        c1=null;
        c2=null;
        c3=null;


    }
}
