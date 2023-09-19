package Threading;

public class one extends Thread{
    public void run(){
        System.out.println("run method1");
    }
    public static void main(String args[]){
        one obj=new one();
        obj.start();


    }
}
