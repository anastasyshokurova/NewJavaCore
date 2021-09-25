package HW1;
import java.util.Arrays;
public class Course {
    private final int[] pits;

    public  Course (int [] pits) {
        this.pits = pits;
    }

    public String toString() {
        return Arrays.toString((this.pits));
    }
    public void doIt (Team team) {
        for (Player player : team.getPlayers()) {
            for ( int pit : pits) {
                if (!player.run(pit)) break;
            }
        }
    }
}
