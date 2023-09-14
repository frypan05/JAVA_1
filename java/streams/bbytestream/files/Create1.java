package streams.bbytestream.files;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.*;

public class Create1 {
    public static void main(String[] args) throws IOException{
        try{
            FileOutputStream obj=new FileOutputStream("D:\\Batch1\\second.txt");
            obj.write(67);
            byte b[]={97,98,99,100};
            obj.write(b);
            String s="hello hi bye bye";
            byte[]b1=s.getBytes();
            obj.write(b1);
            obj.flush();
            obj.close();



        }
        catch(IOException e)
        {
            System.err.print(e);
        }
    }
}