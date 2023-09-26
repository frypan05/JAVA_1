package collections;
import java.util.List;
import java.util.ArrayList;

class User{
    int age;
    int RollNo;
    String Name;
    User (int a, int r, String n)
    {
        this.age=a;
        this.RollNo=r;
        this.Name = n;
    }
}
public class objects2 {
    public static void main(String[] args){
        User obj1 = new User(12,1234,"abc");
        User obj2 = new User(13,1235,"abc");
        User obj3 = new User(14,1236,"abc");
        User obj4 = new User(15,1237,"abc");

        List l1 = new ArrayList();
        l1.add(obj1);
        l1.add(obj2);
        l1.add(obj3);
        l1.add(obj4);

        for (Object b: l1)
        {
            User u = (User)l1;
            System.out.println(u.Name+" "+u.age+" "+u.RollNo) ;
        }
    }
}
