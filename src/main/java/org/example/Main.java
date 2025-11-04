package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Engine motor = new Engine(
//                "Identitate",
//                "Toyota",
//                "Bicicleta rosie", "Diesel");
//        String tipMotor = motor.getEngineType();
//        System.out.println(tipMotor);

////        SuperClass supClasa = new SuperClass();
//        SuperClass subClasa = new SubClass();
//
////        System.out.println("Superclasa " + supClasa);
//        System.out.println("SubClasa " + subClasa);
//        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
//        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
//        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//        System.out.println(ollie);
//        for (int i = 0; i < 25; i++) {
//            ollie.study();
//        }
//        System.out.println(ollie);
//
//        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
//        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
//        System.out.println(ada);
//        System.out.println(esko);
//        ArrayList<Person> persons = new ArrayList<>();
//        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
//        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
//
//        printPersons(persons);

        Person ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//        ollie.credits();        // DOESN'T WORK!
//        ollie.study();              // DOESN'T WORK!
        System.out.println(ollie);   // ollie.toString() WORKS //practic executa metoda din student deoarece aceasta e definita acolo
//        The method to be executed is chosen based on the actual type of the object,
//        which means the class whose constructor is called when the object is created.
    }
//    public static void printPersons(ArrayList<Person> persons) {
//        for (int i = 0; i < persons.size(); i++) {
//            System.out.println(persons.get(i));
//        }
//    }
}