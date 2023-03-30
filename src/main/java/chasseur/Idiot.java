package chasseur;

import supercannard.Canard.Canard;

public class Idiot implements Animal {
    private final Canard canard;
    public Idiot(Canard canard) {
        this.canard = canard;
    }
    public void crier() {
        canard.effectuerCancan();
    }

    public void fuir() {
        canard.effectuerVol();
    }

    public void sePresenter() {
        canard.afficher();
    }

}

