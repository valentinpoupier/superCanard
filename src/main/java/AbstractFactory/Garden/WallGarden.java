package AbstractFactory.Garden;

import AbstractFactory.Wall;

public class WallGarden implements Wall {
    @Override
    public String description() {
        return "Garden Wall";
    }
}
