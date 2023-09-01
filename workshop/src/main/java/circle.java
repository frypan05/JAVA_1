public class circle
{
    static float pi=3.14f;
    void area(int radius)
    {
        System.out.println("area: "+(circle.pi * radius*radius));
    }
    void cir(int radius)
    {
        System.out.println("circumference: "+(2*circle.pi * radius));
    }
    void dia(int radius)
    {
        System.out.println("diameter: "+(2* radius));
    }
    public static void main (String[] args)
    {
        circle c1 = new circle();
        circle c2 = new circle();
        circle c3 = new circle();
        c1.area(5);
        c1.cir(5);
        c1.dia(5);

        c2.area(6);
        c2.cir(6);
        c2.dia(6);

        c3.area(7);
        c3.cir(7);
        c3.dia(7);
    }

}
