package characters;

import treasure.Treasure;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int health;
    private ArrayList<Treasure> treasureSack;


    public Player(String name) {
        this.name = name;
        this.health = 100;
    }
}

