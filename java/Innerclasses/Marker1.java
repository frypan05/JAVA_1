package Innerclasses;
import java.util.*;

    public class Marker1 implements Cloneable {
        public int pid;
        public String pname;
        public double pcost;

        public Marker1(int pid, String pname, double pcost) {
            this.pid = pid;
            this.pname = pname;
            this.pcost = pcost;
        }

        public void showDetail() {
            System.out.println(pid + " " + pname + " " + pcost);
        }

        public static void main(String[] args) throws CloneNotSupportedException {
            Marker1 obj1 = new Marker1(1, "abc", 12.23);
            Marker1 obj3 = obj1;
            int a = (int) 'a';
            Marker1 obj2 = (Marker1) obj1.clone();
        }

    }