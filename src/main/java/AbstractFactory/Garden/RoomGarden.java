package AbstractFactory.Garden;

import AbstractFactory.Room;

public class RoomGarden implements Room {
    @Override
    public String description() {
        return "Garden Room";
    }
}
