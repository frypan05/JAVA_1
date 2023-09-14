package Innerclasses;

class check1
{
    void checkM1()
    {
        System.out.println("checkM1 in CheckClass method");
    }
}
public class AnonymousClass2
{
    public static void main (String[] args) {
        check1 obj = new check1() {
            void checkM1() {
                System.out.println("hehe");
            }

            void checkM2() {
                System.out.println("hihi");
            }
        };
        obj.checkM1();
    }
}
