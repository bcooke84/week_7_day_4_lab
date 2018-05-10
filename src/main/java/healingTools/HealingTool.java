package healingTools;

public abstract class HealingTool {

    private int healingRating;

    public HealingTool(int healingRating) {
        this.healingRating = healingRating;
    }

    public int getHealingRating() {
        return healingRating;
    }
}
