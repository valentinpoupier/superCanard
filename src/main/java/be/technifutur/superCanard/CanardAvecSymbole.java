package be.technifutur.superCanard;

public class CanardAvecSymbole implements Canard{


    private Canard parent;

    public CanardAvecSymbole(Canard parent) {
        this.parent = parent;
    }

    @Override
    public void afficher() {
        System.out.print(  "  o< ");
        parent.afficher();
        System.out.println("( )");
    }

    @Override
    public void nager() {
        parent.nager();
    }

    @Override
    public void effectuerCancan() {
        parent.effectuerCancan();
    }

    @Override
    public void effectuerVol() {
        parent.effectuerVol();
    }
}
