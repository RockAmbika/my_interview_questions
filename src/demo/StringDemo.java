package demo;

import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {
        String str = "Ambika";
        System.out.println(str);
        System.out.println(str.charAt(3));
        System.out.println(str.toUpperCase()); 
        System.out.println(str.toLowerCase());
        System.out.println(str.lastIndexOf(str));
        System.out.println(str.length());
        System.out.println(str.codePointAt(2));
        System.out.println(str.trim());
        System.out.println(str.codePointBefore(5));
    }
}
