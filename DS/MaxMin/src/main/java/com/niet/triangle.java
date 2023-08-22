package com.niet;

public class triangle {
    public static void main(String[] args) {
        int a=1, b=2, c=3;
        if (a>b+c || b>c+a || c>a+b){
            System.out.println("NO");
        }
    }
}
