package chasseur;

public class Chasseur {
    public void chasser(Animal animal) {
        System.out.println("PAN !");
        animal.crier();
        animal.fuir();
    }
}
