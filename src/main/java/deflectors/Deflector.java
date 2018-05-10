package deflectors;

public abstract class Deflector {
    private int deflectorRating;

    public Deflector(int deflectorRating) {
        this.deflectorRating = deflectorRating;
    }

    public int getDeflectorRating() {
        return deflectorRating;
    }
}
