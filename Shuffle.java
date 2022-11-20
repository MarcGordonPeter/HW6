import java.util.Random;

public class Shuffle {
    public Shuffle() {

    }

    public int pick_card() {
        Random r = new Random();
        return r.nextInt(100) + 1;
    }
}
