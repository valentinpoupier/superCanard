package supercannard.Canard;

import supercannard.comportementcancan.ComportementCancan;
import supercannard.comportementvol.ComportementVol;

public abstract class CanardStrategy implements Canard {
    protected ComportementVol comportementVol;
    protected ComportementCancan comportementCancan;

    @Override
    public void nager() {
        System.out.println("Je nage");
    }

    @Override
    public void effectuerCancan() {
        comportementCancan.cancaner();
    }
    @Override
    public void effectuerVol() {
        comportementVol.voler();
    }
    public void setComportementVol(ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
    }
    public void setComportementCancan(ComportementCancan comportementCancan) {
        this.comportementCancan = comportementCancan;
    }
    public ComportementCancan getComportementCancan() {
        return comportementCancan;
    }
    public ComportementVol getComportementVol() {
        return comportementVol;
    }
}
