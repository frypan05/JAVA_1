package collections;
import java.util.ArrayList;
public class ArrayList1
{
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("One");
        l1.add("two");
        l1.add("three");
        l1.add("four");
        l1.add("five");
        l1.add("six");

        System.out.println("l1: "+l1);
        System.out.println("l1.contains(\"six\" :"+l1.contains(l1));

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("one");
        l2.add("one");
        l2.add("one");
        System.out.println(l1.containsAll(l2));

        System.out.println("l1: "+l1);
        l1.remove(1);

        System.out.println("l1: "+l1);
        l1.remove(1);

        System.out.println("l1: "+l1);
        l1.remove(1);
    }
}
