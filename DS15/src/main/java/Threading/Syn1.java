package Threading;
class Counter{
    public static int i; //synchronises gets over deadlock
    public synchronized static void count(){ //shows that the method is synchronized, only one thread can execute the method at the time
        System.out.println("i : "+(i++));
        i++;
    }
}

public class Syn1 {
    public static void main (String[] args) throws InterruptedException{

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("r1");
                    for (int i=1;i<=1000;i++)
                        Counter.count();
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("r2");
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("main: "+ Counter.i);
    }
}
