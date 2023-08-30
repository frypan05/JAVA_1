/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
  public static void main (String[]args)
  {
    int a = 10, b = 11, c = 12;
      System.out.println (a < b && b > c && --c == b);           //false
      System.out.println (a < b && b < c && --c == b++);        //true
      System.out.println (++a >= b-- || c == b || b != c++);    //true
      System.out.println (a + " " + b + " " + c);               // 11 11 11

  }
}
