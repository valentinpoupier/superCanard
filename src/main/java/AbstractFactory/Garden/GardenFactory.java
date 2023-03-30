package AbstractFactory.Garden;

import AbstractFactory.FabricAbstract;
import AbstractFactory.Wall;
import AbstractFactory.Room;
import AbstractFactory.Door;

public class GardenFactory extends FabricAbstract {
    private WallGarden wallGarden;

    @Override
    public Door createDoor() {
        return new DoorGarden();
    }

    @Override
    public Wall createWall() {
        if (this.wallGarden == null) {
            this.wallGarden = new WallGarden();
        }
        return this.wallGarden;
    }

    @Override
    public Room createRoom() {
        return new RoomGarden();
    }
}
