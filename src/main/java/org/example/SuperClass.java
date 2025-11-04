package org.example;

public class SuperClass {

    private String objectVariable;

    public SuperClass() {
        this("Ceva interior");
    }

    public SuperClass(String objectVariable) {
        this.objectVariable = objectVariable;
    }

    public String getObjectVariable() {
        return objectVariable;
    }

    @Override
    public String toString() {
        return "Aici e o lista de charactere: ";
    }
}

class SubClass extends SuperClass {

    public SubClass() {
        super("Subclass");
    }

    @Override
    public String toString() {
        return super.toString() + " SUBCLASA";
    }
}
