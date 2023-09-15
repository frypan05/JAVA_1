package Streams.bbytestream.buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Display1
{
    public static void main (String [] args)
    {
        try
        {
            FileInputStream fb = new FileInputStream("D:\\Batch1\\First.txt");
            BufferedInputStream bb = new BufferedInputStream(fb);
            System.out.println(" "+bb.available());
            System.out.println(" "+bb.skip(3));
            System.out.println("after 3 skips: "+(char)bb.read());

            System.out.println(" :"+bb.markSupported());
        }
        catch(Exception e)
        {
            System.out.println(" e: "+e);
        }
    }
}