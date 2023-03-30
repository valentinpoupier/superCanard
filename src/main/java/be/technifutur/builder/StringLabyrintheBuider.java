package be.technifutur.builder;

public class StringLabyrintheBuider implements LabyrintheBuilder{


    public String build(){
        return null;
    }

    @Override
    public LabyrintheBuilder start() {
        System.out.println("StringLabyrintheBuider.start");
        return this;
    }

    @Override
    public LabyrintheBuilder addPiece(int line, int column) {
        System.out.println("Piece line = " + line + ", column = " + column);
        return this;
    }

    @Override
    public LabyrintheBuilder addMur(int line, int column) {
        System.out.println("Mur line = " + line + ", column = " + column);
        return this;
    }

    @Override
    public LabyrintheBuilder addPorte(int line, int column) {
        System.out.println("Porte line = " + line + ", column = " + column);
        return null;
    }
}
