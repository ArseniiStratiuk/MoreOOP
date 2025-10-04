package characters;
import java.util.Random;

import kickstrategy.RandomKick;

public class King extends Character{

    private static final Random rand = new Random();

    public King() {
        super(5+rand.nextInt(10), 5+rand.nextInt(10), new RandomKick());
    }
}
