package AbstractFactory;

public class TestFabrique {

    public static void main(String[] args) {
        FabricAbstract factory = FabricAbstract.getFactory("Castle");
        ElementLabyrinthe[][] laby = getLabyrinthe(factory);

        for(ElementLabyrinthe e : laby[1]) {
            System.out.println(e.description());
        }
    }

    public static ElementLabyrinthe[][] getLabyrinthe(FabricAbstract factory) {
        ElementLabyrinthe[][] laby = new ElementLabyrinthe[3][3];
        laby[0][0] = factory.createWall();
        laby[0][1] = factory.createWall();
        laby[0][2] = factory.createWall();
        laby[1][0] = factory.createDoor();
        laby[1][1] = factory.createRoom();
        laby[1][2] = factory.createDoor();
        laby[2][0] = factory.createWall();
        laby[2][1] = factory.createWall();
        laby[2][2] = factory.createWall();
        return laby;
    }

}
