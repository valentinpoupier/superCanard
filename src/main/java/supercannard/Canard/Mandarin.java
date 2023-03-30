package supercannard.Canard;

import supercannard.comportementcancan.Cancan;
import supercannard.comportementvol.VolerAvecDesAiles;

public class Mandarin extends CanardStrategy {

    public Mandarin() {
        comportementCancan = new Cancan();
        comportementVol = new VolerAvecDesAiles();
    }
    @Override
    public void afficher() {
        System.out.println("Je suis un mandarin");
    }

}
