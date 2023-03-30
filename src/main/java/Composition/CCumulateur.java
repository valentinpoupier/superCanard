package Composition;

public class CCumulateur implements Commun {
    private Hcommun hcommun = new Hcommun();

    public void inc(int nb) {
        hcommun.inc(nb);
    }

    public int getVal() {
        return hcommun.getVal();
    }

    public int next() {
        inc(2);
        return getVal();
    }

}
