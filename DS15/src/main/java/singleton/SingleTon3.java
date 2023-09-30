package singleton;

import javax.swing.text.DefaultEditorKit;

class Batch1
{
    static Batch1 obj;
    private  Batch1(){
        System.out.println("batch1");
    }
    public static synchronized Batch1 getInstance(){
        if (obj == null)
            obj = new Batch1();
        return obj;
    }
}
public class SingleTon3
{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Batch1 obj = Batch1.getInstance();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Batch1 obj = Batch1.getInstance();
            }
        });
        t1.start();
        t2.start();
    }
}
