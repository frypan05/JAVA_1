package stringtokenizer;
import java.util.StringTokenizer;
public class Create1
{
    public static void main(String [] args)
    {
        String s= "One Two Three Four";
        StringTokenizer obj = new StringTokenizer(s);
//by default delimeter will be ' ' (space)
        System.out.println("1: "+obj.nextToken());
        System.out.println("2: "+obj.nextToken());
        System.out.println("3: "+obj.nextToken());
        System.out.println("4: "+obj.nextToken());
    }
}
