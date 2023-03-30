package be.technifutur.composition;

public class HeritageToComposition {

    public static void main(String[] args) {
        heritage();
    }

    private static void heritage() {
        HCumulateur c = new HCumulateur();
        HPaire p = new HPaire();

        System.out.println(c.getVal());
        System.out.println(c.next());
        System.out.println(c.getVal());

        System.out.println(p.getVal());
        System.out.println(p.next());
        System.out.println(p.getVal());
    }
        private static void composition() {
            CCumulateur c = new CCumulateur();
            CPaire p = new CPaire();

            System.out.println(c.getVal());
            System.out.println(c.next());
            System.out.println(c.getVal());

            System.out.println(p.getVal());
            System.out.println(p.next());
            System.out.println(p.getVal());
    }
}
