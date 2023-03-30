package supercannard.Canard;

public class CanardAvecVague implements Canard{
    private final Canard parent;

    public CanardAvecVague(Canard parent) {
        this.parent = parent;
    }

    @Override
    public void nager() {
        parent.nager();
    }

    @Override
    public void afficher() {
        System.out.print("""
                ~'`~'`~'`~'`~
                """);
        parent.afficher();
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
