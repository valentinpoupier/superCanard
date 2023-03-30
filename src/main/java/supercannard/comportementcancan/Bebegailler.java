package supercannard.comportementcancan;

public class Bebegailler implements ComportementCancan{

    private final ComportementCancan comportementCancan;

    public Bebegailler(ComportementCancan comportementCancan) {
        this.comportementCancan = comportementCancan;
    }

    @Override
    public void cancaner() {
        comportementCancan.cancaner();
        comportementCancan.cancaner();
    }


}
