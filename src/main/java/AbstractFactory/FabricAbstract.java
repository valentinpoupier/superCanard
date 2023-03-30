package AbstractFactory;

import AbstractFactory.Chateau.CastleFactory;
import AbstractFactory.Garden.GardenFactory;

public abstract class FabricAbstract {

    public static FabricAbstract getFactory(String type) {
        return switch (type) {
            case "Castle" -> new CastleFactory();
            case "Garden" -> new GardenFactory();
            default -> null;
        };
    }

    public abstract Door createDoor();

    public abstract Wall createWall();

    public abstract Room createRoom();

}
