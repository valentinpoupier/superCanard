package AbstractFactory.builder;

public interface LabyrintheBuilder {

    LabyrintheBuilder start();

    LabyrintheBuilder addWall(int line, int column);

    LabyrintheBuilder addRoom(int line, int column);

    LabyrintheBuilder addDoor(int line, int column);

}
