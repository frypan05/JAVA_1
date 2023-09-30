package awtt;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrame extends Frame
{
    Frame f1; //object difference
    Label l1,l2;
    FlowLayout f;
    Button b;
    MyFrame() //constructor
    {
        f1 = new Frame("This is the first window");
        l1 = new Label("YAYAYAAYAY");
        l2 = new Label("THIS IS ANOTHERRRR");
        f = new FlowLayout();
        b = new Button("click here");

        f1.setVisible(true);
        f1.setSize(500,500);
        f1.add(l1);
        f1.add(l2);
        f1.add(b);
        //below code helps in closing the window from cross button
        f1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent w) {
                System.exit(0);
            }
        });

        f1.setLayout(f);
    }
}
public class GUI1
{
    public static void main(String[] args)
    {
        MyFrame Frame1 = new MyFrame();
    }
}
