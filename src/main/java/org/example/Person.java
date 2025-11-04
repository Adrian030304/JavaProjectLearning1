package org.example;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "\n " + address;
    }
}

class Teacher extends Person {
    private int salary;
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n salary " + salary + " euro/month";
    }
}


class Student extends Person {
    private int credits;
    Student(String name, String address) {
        super(name, address);
        credits = 0;
    }

    public int credits() {
        return credits;
    }

    public void study() {
        this.credits += 1;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Study credits " + this.credits;
    }

}