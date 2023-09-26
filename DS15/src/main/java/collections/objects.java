package collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
public class objects {
    public static void main (String [] args){
        ArrayList l1 = new ArrayList();
        List l2 = new ArrayList();
        Collection c1 = new ArrayList();
        Iterable It = new ArrayList();

        l1.add(10);
        l1.add("HIHI");
        l1.add(12.34f);
        l1.add(12.456);
        System.out.println(l1);

        l2.add(34);
        l2.add("Batch1");

        System.out.println(l2);

        c1.add(10);
        c1.add("HIHI");
        c1.add(12.34f);
        c1.add(12.456);
        System.out.println(c1);

        for (Object b :c1)
            System.out.println(b+"  =>  "+b.getClass());

        System.out.println(l1.size());

        for (int i = 0 ; i < l1.size() ; i++)
            System.out.println(l1.get(i));
    }
}
