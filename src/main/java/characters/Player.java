package characters;

import behaviours.TakeDamage;
import treasure.Treasure;

import java.util.ArrayList;

public abstract class Player implements TakeDamage {

    private String name;
    private int health;
    private ArrayList<Treasure> treasureSack;


    public Player(String name) {
        this.name = name;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public ArrayList<Treasure> getTreasureSack() {
        return treasureSack;
    }

    public void takeDamage(int damage){
        this.health -= damage;
    }


}

