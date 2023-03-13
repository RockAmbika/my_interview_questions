package demo;

public class ExceptionTest1 {
    public static void main(String[] args) {
        try {
            int a = 9, b = 0;
            int c = a/b;
            System.out.println("Exception occurded");
        }catch (Exception e){
            System.out.println("Catching ....");
        }
    }
}
