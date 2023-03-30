package be.technifutur.composition;

public class HCumulateur extends Hcommun{

    public int next(){
        inc(1);
        return getVal();
    }
}
