package be.technifutur.AbstractFactory.jardin;

import be.technifutur.AbstractFactory.Porte;

public class Barriere implements Porte {
    @Override
    public String desciption() {
        return "Barrière en bois";
    }
}
