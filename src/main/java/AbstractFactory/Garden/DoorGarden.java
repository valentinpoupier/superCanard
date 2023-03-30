package AbstractFactory.Garden;

import AbstractFactory.Door;

public class DoorGarden implements Door {
    @Override
    public String description() {
        return "Garden Door";
    }
}
