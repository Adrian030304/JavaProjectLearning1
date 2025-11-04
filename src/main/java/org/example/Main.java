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
//        TextMessage message = new TextMessage("ope", "It's going great!");
//        System.out.println(message.read());
//
//        ArrayList<TextMessage> textMessage = new ArrayList<>();
//        textMessage.add(new TextMessage("private number", "I hid the body."));
//
//        ArrayList<String> pages = new ArrayList<>();
//        pages.add("Split your method into short, readable entities.");
//        pages.add("Separate the user-interface logic from the application logic.");
//        pages.add("Always program a small part initially that solves a part of the problem.");
//        pages.add("Practice makes the master. Try different out things for yourself and work on your own projects.");
//
//        Ebook book = new Ebook("Tips for programming.", pages);
//
//        int page = 0;
//        while (page < book.pages()) {
//            System.out.println(book.read());
//            page = page + 1;
//        }
//        ArrayList<Readable> readingList = new ArrayList<>();
//
//        readingList.add(new TextMessage("ope", "never been programming before..."));
//        readingList.add(new TextMessage("ope", "gonna love it i think!"));
//        readingList.add(new TextMessage("ope", "give me something more challenging! :)"));
//        readingList.add(new TextMessage("ope", "you think i can do it?"));
//        readingList.add(new TextMessage("ope", "up here we send several messages each day"));
//
//
//        ArrayList<String> pages = new ArrayList<>();
//        pages.add("A method can call itself.");
//
//        readingList.add(new Ebook("Introduction to Recursion.", pages));
//
//        for (Readable readable: readingList) {
//            System.out.println(readable.read());
//        }

//        TextMessage message = new TextMessage("ope", "Oh wow, this printer knows how to print these as well!");
//
//        ArrayList<String> pages = new ArrayList<>();
//        pages.add("Values common to both {1, 3, 5} and {2, 3, 4, 5} are {3, 5}.");
//        Ebook book = new Ebook("Introduction to University Mathematics.", pages);
//
//        Printer printer = new Printer();
//        printer.print(message);
//        printer.print(book);

        ReadingList jonisList = new ReadingList();
        jonisList.add(new TextMessage("arto", "have you written the tests yet?"));
        jonisList.add(new TextMessage("arto", "have you checked the submissions yet?"));
        int i = 0;
        while (i < 1000) {
            jonisList.add(new TextMessage("arto", "have you written the tests yet?"));
            i += 1;
        }
        System.out.println("Delegating the reading to Verna");

        ReadingList vernasList = new ReadingList();
        vernasList.add(jonisList);
        System.out.println(vernasList + "CEVA");
        vernasList.read();

        System.out.println();
        System.out.println("Joni's to-read: " + jonisList.toRead());
//        System.out.println("Joni's to-read: " + jonisList.toRead());
    }


//    public static void printPersons(ArrayList<Person> persons) {
//        for (int i = 0; i < persons.size(); i++) {
//            System.out.println(persons.get(i));
//        }
//    }
}