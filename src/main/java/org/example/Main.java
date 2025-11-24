package org.example;

import java.io.FilterOutputStream;
import java.io.Serializable;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Printer printer = new Printer();
//        printer.printManyTimes(new Clasa1("AA"), 5);
//        CharSequence sirCaractere = "ADRAIN";
//        printer.printCharacters(sirCaractere);
//        Object ob = new Clasa1("BB");
//        System.out.println(ob.hashCode());
//        System.out.println(ob);

        Movable muta = new Organism(10,12);
        System.out.println(muta);
        muta.move(2,3);
        System.out.println(muta);


    }
}
