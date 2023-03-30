package be.technifutur.builder;

public interface LabyrintheBuilder {

    LabyrintheBuilder start();
    LabyrintheBuilder addPiece(int line, int column);
    LabyrintheBuilder addMur(int line, int column);
    LabyrintheBuilder addPorte(int line, int column);
}
