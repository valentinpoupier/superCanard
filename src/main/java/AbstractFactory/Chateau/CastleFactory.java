package AbstractFactory.Chateau;

import AbstractFactory.FabricAbstract;
import AbstractFactory.Wall;
import AbstractFactory.Room;
import AbstractFactory.Door;

public class CastleFactory extends FabricAbstract {
    @Override
    public Door createDoor() {
        return new DoorCastle();
    }

    @Override
    public Wall createWall() {
        return new WallCastle();
    }

    @Override
    public Room createRoom() {
        return new RoomCastle();
    }
}
