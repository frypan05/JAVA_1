package streams;

import java.io.IOException;

public class Predefinedstreams
{
    public static void main (String [] args) throws IOException
    {
        int i=System.in.read();
        System.out.println(i);
        System.out.println("i"+i);
        System.out.println();
    }
}
