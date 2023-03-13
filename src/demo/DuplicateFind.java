package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateFind {
    public static void main(String[] args) {
            int[] numbers = {1,3,6,8,8,9,9,10,4};
            Set<Integer> set = new HashSet<>();
            Set<Integer> duplicates = Arrays.stream(numbers)
                    .filter(n -> !set.add(n))
                    .collect(HashSet::new, HashSet::add, HashSet::addAll);

            System.out.println("Duplicate numbers: " + duplicates);
        }
    }


