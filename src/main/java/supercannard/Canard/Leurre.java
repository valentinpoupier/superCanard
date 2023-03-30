package supercannard.Canard;

import supercannard.comportementcancan.CanardMuet;
import supercannard.comportementvol.NePasVoler;

public class Leurre extends CanardStrategy {

    public Leurre() {
        comportementCancan = new CanardMuet();
        comportementVol = new NePasVoler();
    }
    @Override
    public void afficher() {
        System.out.println("Je suis un leurre");
    }
}
