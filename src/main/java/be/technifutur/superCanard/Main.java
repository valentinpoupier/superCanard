package be.technifutur.superCanard;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Canard> mare = Arrays.asList(
                new Colvert(),
                getBeauColvertMuet(),
                new CanardPlastique(),
                new Leurre(),
                new CanardEnPlastiqueMuet()
        );

        for (Canard c : mare){
            System.out.println("~~~~~~~~~~~~~~~");
            c.afficher();
            c.nager();
            c.effectuerCancan();
            c.effectuerVol();
        }
    }

    /**
     * Methode factory
     * @return
     */
    private static Canard getBeauColvertMuet() {
        Colvert canard = new Colvert();
        canard.setComportementDeCancan(new Muet());
        return new CanardAvecVagues(canard);
    }


}
