import java.util.Scanner;
interface Shapes
{
    float pi=3.14f;
    void area();
}
class Rectangle implements Shapes
{
    public void area()
    {

    }
class Circle implements Shapes
{
    public void area() {

    }
}
public Circle (int r)
    {
        this.radius=r;
    }
    public void area()
    {
        System.out.println(Shapes.pi*this.radius*this.radius);
    }
    public static void main (String [] args0)
    {
        System.out.println("Enter the radius: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        Circle cl = new Circle(r);
    }
}
