package Composition;

public class HPaire extends Hcommun{
    public int next(){
        inc(2);
        return getVal();
    }
}
