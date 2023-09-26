package collections;
import java.util.ArrayList;
import java.util.List;


public class Generics1 {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        List<Integer> LL = new ArrayList<Integer>();
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(12);
        l1.add(12);
        l1.add(18687);
        l1.add(16886);
        l1.add(912);
        //l1.(313212.54);
        l1.add(2, 34234);


        System.out.println(l1);
        l1.add(4, 424234232);
        System.out.println(l1);
        l1.add(5, 696969);
        System.out.println(l1);

        c1.add(100);
        c1.add(101);
        c1.add(102);
        c1.add(103);
        System.out.println("c: "+c1);
        l1.addAll(c1);
        System.out.println("l1 : "+l1);
    }
}