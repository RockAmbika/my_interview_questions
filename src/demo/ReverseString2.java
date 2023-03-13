package demo;

public class ReverseString2 {
    public static void main(String[] args) {
        String s = "Hello   How are you";
        String revString = "";
        for (int i = s.length()-1;i>=0;i--){
           revString += s.charAt(i);
        }
        System.out.println(revString);
    }
}
