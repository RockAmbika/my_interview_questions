package demo;

import java.util.ArrayList;
import java.util.List;

public class ElementRemove {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(45);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
