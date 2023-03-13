package demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondHighestSalary {

        public static void main(String[] args) {
            List<Double> salaries = Arrays.asList(50000.0, 75000.0, 100000.0, 85000.0, 60000.0);

            Optional<Double> secondMaxSalary = salaries.stream()
                    .distinct()
                    .sorted()
                    .skip(salaries.size() - 2)
                    .findFirst();

            if (secondMaxSalary.isPresent()) {
                System.out.println("The second highest salary is: " + secondMaxSalary.get());
            } else {
                System.out.println("There is no second highest salary.");
            }
        }
    }

