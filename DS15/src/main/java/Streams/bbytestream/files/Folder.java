package Streams.bbytestream.files;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.*;
public class Folder
{
    public static void main (String[] args) throws IOException
    {
        //where i wanna define a location of the folder
        Path dir = Paths.get("D:\\Batch1\\NewFolder");
        Path create = Files.createDirectory(dir);

        FileInputStream Reading = new FileInputStream("D:\\hehe.jpg");
        BufferedInputStream br = new BufferedInputStream(Reading);

        FileOutputStream obj =new FileOutputStream(dir+"\\hehe.jpg");
        BufferedOutputStream bw = new BufferedOutputStream(obj);

        int i;
        while ((i=br.read())!=-1)
            bw.write(i);
    }
}
