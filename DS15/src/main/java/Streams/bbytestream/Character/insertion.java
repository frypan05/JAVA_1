package Streams.bbytestream.Character;

import java.io.FileWriter;
import java.io.IOException;

public class insertion
{
    public static void main(String[] args) throws IOException
    {
        FileWriter f1 = new FileWriter("D:\\Batch1\\Char.txt");
        f1.write("This is char string writer file");

        f1.flush();
        f1.close();
        System.out.println("Created successfully");
    }
}
