package HW1;

public class Player {
    private final String name;
    private int energy;
    private boolean isWin;

    public Player (String name, int energy) {
        this.name = name;
        this.energy = energy;
        this.isWin = false;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public boolean isWin() {
        return isWin;
    }
    public boolean run (int distance) {
        if (energy >= distance) {
            energy -= distance;
            isWin = true;
        }
        else isWin = false;
        return isWin;
    }
}