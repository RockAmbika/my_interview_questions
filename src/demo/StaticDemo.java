package demo;

import static demo.StaticDemo.a;
import static demo.StaticDemo.display;

public class StaticDemo {
    static int a = 10;
    static void display(){
        System.out.println("Static Method");
    }
    static {
        System.out.println("Static block");
    }
}
class A{
    public static void main(String[] args) {
      //  StaticDemo obj = new StaticDemo();
        System.out.println(a);
         display();
    }
}
