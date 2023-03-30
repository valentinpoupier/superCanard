package be.technifutur.superCanard;

public class CanardAvecVagues implements Canard{
    private final Canard parent;

    public CanardAvecVagues(Canard parent) {
        this.parent = parent;
    }

    @Override
    public void afficher() {
        parent.afficher();
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
