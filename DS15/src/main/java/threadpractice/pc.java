/*package threadpractice;
class Utility {
    int i;
    boolean bool;

    public synchronized void set(int i) throws InterruptedException {
        while (bool) {
            wait();
        }
        this.i = i;
        bool = true;
        System.out.println("Producer: " + i);
        notify();
    }
    public synchronized void get() throws InterruptedException {
        while (!bool) {
            wait();
        }
        bool = false;
        System.out.println("Consumer"+i);
        notify();
    }
}
class Consumer implements Runnable{
    private Utility u;
    public Consumer(Utility u){
        this.u = u;
        Thread Consume = new Thread(this,"Consumer");
        Consume.start();
    }
}
class Producer implements Runnable{
        private Utility u;
        public Producer(Utility u ){
            this.u = u;
            Thread produce = new Thread(this,"Producer");
            produce.start();
        }
        public void run(){
            int i =0;
            while(true)
            {
                try {
                    u.set(i++);
                }
                catch (InterruptedException ex){
                    System.out.println("e: "+ex);
            }
        }
    }
}
public class pc
{
    public static void main(String []args)
    {
        Utility u = new Utility();
        Producer producer = new Producer(u);
        Consumer consumer = new Consumer(u);
    }
}
*/