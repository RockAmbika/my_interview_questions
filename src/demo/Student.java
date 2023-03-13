package demo;

public class Student {
    String name;
    int rno;
    Student(){
        name = "Ambika";
        rno = 123;
    }

    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println(obj.name);
        System.out.println(obj.rno);
    }
}
