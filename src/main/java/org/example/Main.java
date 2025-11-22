package org.example;

import java.io.FilterOutputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        there are built in interfaces such as list, map, set , collection
//        List<String> strings = new ArrayList<>();
//        we can also use linkedlists through the list interface
//        List<String> strings = new LinkedList<>();
//        strings.add("ama are mere multe de vanzare");
//        List<String> names = new ArrayList<>();
//        names.add("Ion");
//        names.add("Tom");
//        names.add("Harry");
//        System.out.println(mainProgram.returnSize(names));

//        now map is interface for hash tables through hash maps
        Map<String, String> maps = new HashMap<>();
        maps.put("Nicolae", "Guta");
        maps.put("Florin","Salam");

        for (String key: maps.keySet()) {
            System.out.println(key + ": " + maps.get(key));
        }
//        The keySet method returns a set of elements that implement the Set interface.
//        You can use a for-each statement to go through a set that implements the Set interface.

//            in java sets are implemented through hashsets, they are like sets in python
//        Set<String> set = new HashSet<>();
//        set.add("AA");
//        set.add("AA");
//        set.add("BB");
//
//        for (String s: set) {
//            System.out.println(s);
//        }
//        the List and Set interfaces implement the Collection interface
            Map<String, String> translations = new HashMap<>();
        translations.put("ni hao", "hello");
        translations.put("dui", "yes");

        Set<String> keys = translations.keySet();
        Collection<String> keyCollection = keys;

        System.out.println("Keys:");
        for (String key: keyCollection) {
            System.out.println(key);
        }

        System.out.println();
        System.out.println("Values: ");
        Collection<String> values = translations.values();

        for (String value: values) {
            System.out.println(value);
        }
    }


//    public static void printPersons(ArrayList<Person> persons) {
//        for (int i = 0; i < persons.size(); i++) {
//            System.out.println(persons.get(i));
//        }
//    }
}

class mainProgram {
    public static int returnSize(List<String> names) {
        return names.size();
    }
}