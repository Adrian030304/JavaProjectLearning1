package org.example;

import java.util.ArrayList;
import java.util.Scanner;

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
        ArrayList<Point> puncte = new ArrayList<>();
        puncte.add(new Point(4,8));
        puncte.add(new ColorPoint(1, 1, "green"));
        puncte.add(new ColorPoint(2, 5, "blue"));
        puncte.add(new Point3D(5, 2, 8));
        puncte.add(new Point(0, 0));
        for (Point p: puncte) {
            System.out.println(p);
        }
//        ideea e ca inidiferent de tipul obiectului nostru care e in cazul asta varibila de tipul lista de POINT
//        cand vor fi folosite acele obiecte, ele vor folosi metoda toString care e determinata de tipul actual al variabilei
//        chiar daca lista stocheaaza aceste obiecte in lista de tipul Point
        /*

        As we can see, the sequence of events caused by the method call has multiple steps. The principle, however, is clear: The definition for the method is first searched for in the class definition of the actual type of the object. If it is not found, we next examine the superclass.
        If the definition cannot be found there, either, we move on to the superclass of this superclass, etc...

        */

//        UserInterface userInterface = new UserInterface(new Scanner(System.in));
//        userInterface.addOperation(new PlusOperation());
//
//        userInterface.start();

    }


//    public static void printPersons(ArrayList<Person> persons) {
//        for (int i = 0; i < persons.size(); i++) {
//            System.out.println(persons.get(i));
//        }
//    }
}