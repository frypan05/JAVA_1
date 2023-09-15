package Streams.bbytestream.buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Display2
{
    public static void main (String [] args)
    {
        try
        {
            FileInputStream fb = new FileInputStream("D:\\Batch1\\First.txt");
            BufferedInputStream bb = new BufferedInputStream(fb);
            int i;
            while ((i=bb.read())!=-1)
            {
                System.out.print((char)i);
            }
        }
        catch (Exception e)
        {
            System.out.println("e: "+e);
        }
    }
}
