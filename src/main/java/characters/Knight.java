package characters;
import java.util.Random;

import kickstrategy.RandomKick;

public class Knight extends Character{

    private static final Random rand = new Random();

    public Knight() {
        super(2+rand.nextInt(10), 2+rand.nextInt(10), new RandomKick());
    }
}
