package org.example;

import java.io.FilterOutputStream;
import java.io.Serializable;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        List<String> inputs = new ArrayList<>();
//        while (true) {
//            String row = scanner.nextLine();
//            if (row.trim().isEmpty()) continue;
//            if (row.equals("end")) break;
//            inputs.add(row);
//        }
//
//        long numbersDivisible = inputs.stream()
//                .mapToInt(s -> Integer.valueOf(s))
//                .filter(number -> number % 3 == 0)
//                .count();
//        double average = inputs.stream()
//                .mapToInt(s -> Integer.valueOf(s))
//                .average().getAsDouble();
//
//        //using an external function as parameter for lambda
//        int filtered = inputs.stream().mapToInt(value -> Main.intValue(value)).sum();
//        // using method reference
//        int filtered2 = inputs.stream().mapToInt(Main::intValue).sum();
//
//        System.out.println("SUM" + filtered);
//        System.out.println("Divisible by three " + numbersDivisible);
//        System.out.println("Average number: " + average);

        List<Integer> numere = new ArrayList<>();

        numere.add(2);
        numere.add(3);
        numere.add(4);
        numere.add(5);
        numere.add(6);

        int suma = numere.stream().reduce(0,(previous, numar) -> previous + numar);
        System.out.println(numere);
        System.out.println(suma);

    }
//    public static int intValue(String num) {
//        return Integer.valueOf(num);
//    }
}
