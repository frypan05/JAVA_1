package shapes;

public class Circle
{
    double k =3.14;
    public void CircleArea(int r)
    {
        System.out.println("The area of circle is: "+k*r*r);
    }
    public static void main(String[] args)
    {
        Circle cl = new Circle();
        cl.CircleArea(5);
    }
}
