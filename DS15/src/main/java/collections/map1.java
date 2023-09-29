package collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;
public class map1
{
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap();
        HashMap<String, Integer> m2 = new HashMap();
        m2.put("Mango",40);
        m2.put("Apple",70);
        m2.put("Banana",30);
        m2.put("Tree",50);
        m2.put("More tree",20);

        System.out.println("original m2: "+m2);
        m2.put("grapes",120);
        System.out.println("1st updated m2: "+m2);
        m2.put("Leech",140);
        System.out.println("2nd updated m2: "+m2);
        Map<String, Integer> Lm1 = new LinkedHashMap();
        LinkedHashMap<String, Integer> Lm2 = new LinkedHashMap();

    }
}
