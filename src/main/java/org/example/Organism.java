package org.example;

interface Movable {
    public void move(int dx, int dy);
}

public class Organism implements Movable{

    public int x, y;
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
        System.out.println("Coordinates moved by " + dx + " and " + dy);
    }

    @Override
    public String toString() {
        return "x: " + x + ";" + "y: " + y;
    }

}
