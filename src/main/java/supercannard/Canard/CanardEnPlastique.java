package supercannard.Canard;

import supercannard.comportementcancan.Coincoin;
import supercannard.comportementvol.NePasVoler;

public class CanardEnPlastique extends CanardStrategy {

    public CanardEnPlastique() {
        comportementCancan = new Coincoin();
        comportementVol = new NePasVoler();
    }
    @Override
    public void afficher() {
        System.out.println("Je suis un canard en plastique");
    }
}
