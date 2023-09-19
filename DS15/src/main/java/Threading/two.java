package Threading;
class batch1a extends Thread{
    public void run(){
        System.out.println("batch1a runnn");
        System.out.println(currentThread());

    }
}
class batch13a extends Thread{
    public void run()
    {
        System.out.println("batch13a run");

    }
}
public class two {
    public static void main(String[] args){
        batch1a obj1=new batch1a();
        batch13a obj2=new batch13a();
        obj1.start();
        obj2.start();

    }

}
