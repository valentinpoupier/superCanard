package Composition;

public class Hcommun implements Commun{
    private int val = 0;

    public void inc(int nb) {
        val += nb;
    }

    public int getVal() {
        return val;
    }
}
