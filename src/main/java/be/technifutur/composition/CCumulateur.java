package be.technifutur.composition;

public class CCumulateur {
    private Hcommun commun = new Hcommun();

    public int getVal() {
        return commun.getVal();
    }
    public int next(){
        commun.inc(1);
        return getVal();
    }

}
