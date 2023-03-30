package supercannard;

import supercannard.Canard.*;
import supercannard.comportementcancan.Bebegailler;
import supercannard.comportementcancan.CanardMuet;
import supercannard.comportementcancan.Coincoin;
import supercannard.comportementcancan.Alternatif;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Canard> mare = Arrays.asList(
                new Colvert(),
                getColvertMuet(),
                new CanardAvecSymbole(new Colvert()),
                new CanardEnPlastique(),
                new Leurre(),
                new CanardVibrant()
        );
        Colvert colvert = new Colvert();
        colvert.afficher();
        colvert.nager();
        colvert.setComportementCancan(new Alternatif(colvert.getComportementCancan(), new Coincoin()));
        colvert.effectuerCancan();
        colvert.effectuerCancan();
        colvert.effectuerCancan();
        colvert.effectuerCancan();
        System.out.println("-----------------");
        colvert.setComportementCancan(new Bebegailler(new Alternatif(colvert.getComportementCancan(), new Coincoin())));
        colvert.effectuerCancan();
        System.out.println("-----------------");
        colvert.setComportementCancan(new Bebegailler(new Alternatif(new Bebegailler(colvert.getComportementCancan()), colvert.getComportementCancan())));
        colvert.effectuerCancan();
        System.out.println("-----------------");

        for (Canard canard : mare) {
            canard.afficher();
            canard.nager();
            canard.effectuerCancan();
            canard.effectuerVol();
            System.out.println("-----------------");
        }

    }

    /**
     * Methode factory
     * @return un colvert muet
     */
    private static Canard getColvertMuet() {
        Colvert colvert = new Colvert();
        colvert.setComportementCancan(new CanardMuet());
        return new CanardAvecVague(colvert);
    }
}