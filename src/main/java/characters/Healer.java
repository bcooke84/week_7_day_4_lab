package characters;

import healingTools.HealingTool;

public abstract class Healer extends Player {

    private HealingTool healingTool;

    public Healer(String name, HealingTool healingTool) {
        super(name);
        this.healingTool = healingTool;
    }

    public int heal(){
        return this.healingTool.getHealingRating();
    }
}
