package com.niet;

public class allatonce {
    public static void main (String[] args){
        int Byte=4;
        int x=Byte*8;
        double min=-Math.pow(2,x-1);
        double max=Math.pow(2,x-1)-1;

        System.out.println("Max Int Value is: "+min);
        System.out.println("Min Int Value is: "+max);
        System.out.println("Hello Guys");
    }

}
