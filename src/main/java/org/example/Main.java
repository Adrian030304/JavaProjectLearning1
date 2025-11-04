package org.example;

public class Main {
    public static void main(String[] args) {
        Engine motor = new Engine(
                "Identitate",
                "Toyota",
                "Bicicleta rosie", "Diesel");
        String tipMotor = motor.getEngineType();
        System.out.println(tipMotor);
    }
}