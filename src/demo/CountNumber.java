package demo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 4};
                long count = Arrays.stream(arr)
                        .boxed()
                        .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                        .values()
                        .stream()
                        .filter(e -> e > 1)
                        .count();
                System.out.println("Number of duplicates: " + count);
            }
        }

