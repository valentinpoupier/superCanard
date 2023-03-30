package be.technifutur.composition;

public class Hcommun {
    private int val = 0;

    public void inc(int nb){
        val+=nb;
    }

    protected int getVal(){
        return val;
    }

}
