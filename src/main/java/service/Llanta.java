package service;

public class Llanta {
    private int r;

    public Llanta(int rin) {
        this.r = rin;
    }

    @Override
    public String toString() {
        return "Llanta con rin: " + r;
    }
}
