package org.example;

public class Printer {

    public void printManyTimes(Object obiect, int times){
        int i = 0;
        while (i < times) {
            System.out.println(obiect.toString());
            System.out.println(obiect.hashCode());
            i++;
        }
    }

    public void printCharacters (CharSequence string) {
        int i = 0;
        while (i < string.length()) {
            System.out.println(string.charAt(i));
            i++;
        }
    }
}
