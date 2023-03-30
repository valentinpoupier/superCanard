package be.technifutur.builder;

import be.technifutur.AbstractFactory.ElementLabyrinthe;
import be.technifutur.AbstractFactory.FabriqueAbstraite;

import java.util.ArrayList;

public class ArrayLabyrintheBuilder implements LabyrintheBuilder{

    private final FabriqueAbstraite factory;
    private ArrayList<ArrayList<ElementLabyrinthe>> stock;
    private int currentLine;

    public ArrayLabyrintheBuilder(FabriqueAbstraite factory) {
        this.factory=factory;
    }
    private void updateCurrentLine(int line) {
        if (line >currentLine) {
            stock.add(new ArrayList<ElementLabyrinthe>());
            currentLine++;
        }
    }
    public ElementLabyrinthe[][] build(){
        ElementLabyrinthe[][] result = new ElementLabyrinthe[stock.size()][];
        for (int i = 0; i < stock.size(); i++) {
            result[i]=stock.get(i).toArray(new ElementLabyrinthe[0]);
        }
        return result;
    }

    @Override
    public LabyrintheBuilder start() {
        stock = new ArrayList<ArrayList<ElementLabyrinthe>>();
        currentLine=-1;
        return this;
    }

    @Override
    public LabyrintheBuilder addPiece(int line, int column) {
        updateCurrentLine(line);
        stock.get(line).add(factory.createPiece());
        return this;
    }

    @Override
    public LabyrintheBuilder addMur(int line, int column) {
        updateCurrentLine(line);
        stock.get(line).add(factory.createMur());
        return this;
    }

    @Override
    public LabyrintheBuilder addPorte(int line, int column) {
        updateCurrentLine(line);
        stock.get(line).add(factory.createPorte());
        return this;
    }
}
