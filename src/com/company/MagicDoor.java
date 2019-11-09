package com.company;

public class MagicDoor {
    public static Hero[] DOOR() {
        Hero a = new Hero(100, 20, "Physical");
        Hero b = new Hero(100, 20, "Magic");
        Hero c = new Hero(100, 20, "Kinetic");
        Hero doc = new Hero(100, 20, "treatment");

        Hero[] players = {a, b, c, doc};
        return players;

    }


}
