package intt;

import java.util.*;
public class GarbageCollection
{
    public static void main(String[] args)
{
    Runtime rc=Runtime.getRuntime();
    GarbageCollection obj = new GarbageCollection();
    System.out.println(rc.freeMemory());
    obj = null;
    rc.gc();
    System.out.println(rc.freeMemory());
    System.out.println("hehe");
}
}
