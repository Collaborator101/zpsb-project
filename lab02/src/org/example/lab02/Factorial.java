package org.example.lab02;

public class Factorial {
    private int value;

    public Factorial(int value) {
        this.value = value;
    }

    private int calculate(int v) {
        if (v > 1)
            return v * this.calculate(v - 1);
        else
            return 1;
    }

    public int result() {
        return this.calculate(this.value);
    }

    @Override
    public String toString() {
        return "" + this.result();
    }
}
