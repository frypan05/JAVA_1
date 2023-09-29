package collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class set2
{
    public static void main(String[] args) {
        Set<Integer> s1 = new LinkedHashSet();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(10);
        s1.add(40);
        System.out.println("s1: "+s1);
        LinkedHashSet<Integer> s2 = new LinkedHashSet();

    }
}