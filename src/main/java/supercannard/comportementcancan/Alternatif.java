package supercannard.comportementcancan;

public class Alternatif implements ComportementCancan{

    private final ComportementCancan comportementCancan;
    private final ComportementCancan comportementCancan2;

    private boolean cancaner = true;

    public Alternatif(ComportementCancan comportementCancan, ComportementCancan comportementCancan2) {
        this.comportementCancan = comportementCancan;
        this.comportementCancan2 = comportementCancan2;
    }

    @Override
    public void cancaner() {
        if(cancaner) {
            comportementCancan.cancaner();
        } else {
            comportementCancan2.cancaner();
        }
        cancaner = !cancaner;
    }

}
