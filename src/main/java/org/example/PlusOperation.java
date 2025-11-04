package org.example;

import java.util.Scanner;

public class PlusOperation extends Operation {
    public PlusOperation() {
        super("PlusOperation");
    }

    @Override
    public void execute(Scanner scanner) {
        System.out.println("First number: ");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Second number: ");
        int num2 = Integer.valueOf(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (num1 + num2));

    }
}
