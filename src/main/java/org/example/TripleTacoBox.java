package org.example;

public class TripleTacoBox implements TacoBox {
    private int tacos;
    TripleTacoBox() {
        int tacos = 3;
    }

    public int tacosRemaining() {
        return tacos;
    }

    public void eat() {
        if (tacos > 0) {
            tacos -= 1;
        }
    }

}

class CustomTacoBox implements TacoBox {
    private int  tacos;
    CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }

    public int tacosRemaining() {
        return tacos;
    }

    public void eat() {
        if (tacos > 0) {
            tacos -= 1;
        }
    }


}
