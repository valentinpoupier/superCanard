package supercannard.Canard;

import supercannard.comportementcancan.CanardMuet;
import supercannard.comportementvol.NePasVoler;

public class CanardVibrant extends CanardStrategy {

    public CanardVibrant() {
        comportementCancan = new CanardMuet();
        comportementVol = new NePasVoler();
    }
    @Override
    public void afficher() {
        System.out.println("Je suis un canard vibrant");
    }
}
