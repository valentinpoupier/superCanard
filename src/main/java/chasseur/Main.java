package chasseur;

import supercannard.Canard.Colvert;

public class Main {
    public static void main(String[] args) {
        Chasseur chasseur = new Chasseur();
        Colvert colvert = new Colvert();
        Animal animal = new Idiot(colvert);

        animal.sePresenter();

        chasseur.chasser(animal);
    }
}
