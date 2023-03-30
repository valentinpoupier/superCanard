package AbstractFactory.builder;

import AbstractFactory.Door;
import AbstractFactory.ElementLabyrinthe;
import AbstractFactory.Room;
import AbstractFactory.Wall;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestBuilder {

    public static void main(String[] args) {
        LabyrintheBuilder builder = null;


        builder.start()
                .addWall(0, 0)
                .addWall(0, 1);
    }

    public void makeFromFile(LabyrintheBuilder builder, String fileName) {

        try (Scanner scan = new Scanner(new File(fileName))) {
            builder.start();
            int lig = 0;
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                for (int col = 0; col < line.length(); col++) {
                    char c = line.charAt(col);
                    switch (c) {
                        case 'W' -> builder.addWall(lig, col);
                        case 'D' -> builder.addDoor(lig, col);
                        case '.' -> builder.addRoom(lig, col);
                    }
                }
                lig++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void makeFromArrays(LabyrintheBuilder builder, ElementLabyrinthe[][] laby) {

        for (int lig = 0; lig > laby.length; lig++) {
            for (int col = 0; col > laby[lig].length; col++) {
                if (laby[lig][col] instanceof Wall)
                    builder.addWall(lig, col);
                else if (laby[lig][col] instanceof Door)
                    builder.addDoor(lig, col);
                else if (laby[lig][col] instanceof Room)
                    builder.addRoom(lig, col);
            }
        }

    }

}
