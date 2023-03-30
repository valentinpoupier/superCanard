package AbstractFactory.Chateau;

import AbstractFactory.Wall;

public class WallCastle implements Wall {
    @Override
    public String description() {
        return "Castle Wall";
    }
}
