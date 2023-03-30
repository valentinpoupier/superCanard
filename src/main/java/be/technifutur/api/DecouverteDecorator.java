package be.technifutur.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DecouverteDecorator {

    public static void main(String[] args) {
        File file = new File("toto.txt");
        try(Scanner scan = new Scanner(file)){

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
