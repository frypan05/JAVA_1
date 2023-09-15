package Streams.bbytestream.files;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class revision2
{
    public static void main (String [] args) throws FileNotFoundException,IOException {
        FileInputStream obj =new FileInputStream(""+"D:\\Batch1\\First.txt");
        System.out.println("available byte stream in file");
        System.out.println(" "+obj.read());
        System.out.println(" "+obj.read());
        int i;
        while ((i=obj.read())!=-1)
            System.out.print(i+" ");
    }
}
