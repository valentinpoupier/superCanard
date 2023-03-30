package supercannard.Canard;

public class CanardAvecSymbole implements Canard{
    private final Canard parent;

    public CanardAvecSymbole(Canard parent) {
        this.parent = parent;
    }

    @Override
    public void nager() {
        parent.nager();
    }

    @Override
    public void afficher() {
        System.out.print("""
                       ,~~.
                      (  6 )-_,
                 (\\___ )=='-'
                  \\ .   ) )
                   \\ `-' /   \s
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
