package collections;
import java.util.HashSet;
import java.util.Set;

public class set1
{
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        System.out.println("s1: "+s1);
        HashSet<Integer> s2 = new HashSet<>();
        s2.add(11);
        s2.add(12);
        s2.add(13);
        s2.add(14);
        s2.add(11);
        s2.add(20);
        System.out.println("s2: "+s2);

        s1.remove(s1);
        System.out.println("s1 remove: "+s1);

        s2.addAll(s1);     //union (All s1 elements are added to s2)
        System.out.println("s2 add all: "+s2);

        s2.retainAll(s1);  //intersection (common elements are gonna be printed)
        System.out.println("s2 retain all: "+s2);

        s2.forEach(ele->
        {
            System.out.println("ele: "+ele);
        });

    }
}
