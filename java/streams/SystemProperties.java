package streams;

import java.util.*;
public class SystemProperties {
    public static void main(String[] args)
    {
        System.out.println("SystemProperties");
        //System.out.println(System.getProperties());
        System.out.println(System.getProperty( "java.class.path"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
    }

}