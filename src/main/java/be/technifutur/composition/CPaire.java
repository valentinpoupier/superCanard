package be.technifutur.composition;

public class CPaire {
    private Hcommun commun = new Hcommun();

    public void inc(int nb) {
        commun.inc(nb);
    }

    public int getVal() {
        return commun.getVal();
    }
    public int next(){
        inc(2);
        return getVal();
    }
}
