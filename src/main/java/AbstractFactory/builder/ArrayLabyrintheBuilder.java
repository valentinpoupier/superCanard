package AbstractFactory.builder;

import AbstractFactory.ElementLabyrinthe;

public class ArrayLabyrintheBuilder implements LabyrintheBuilder{

    public ElementLabyrinthe[] build(){
        return null;
    }


    @Override
    public LabyrintheBuilder start() {
        return null;
    }

    @Override
    public LabyrintheBuilder addWall(int line, int column) {
        return null;
    }

    @Override
    public LabyrintheBuilder addRoom(int line, int column) {
        return null;
    }

    @Override
    public LabyrintheBuilder addDoor(int line, int column) {
        return null;
    }
}
