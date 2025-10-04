package kickstrategy;

import java.util.Random;
import characters.Character;

public class RandomKick implements KickStrategy {
    private static final Random rand = new Random();

    @Override
    public void kick(Character c1, Character c2) {
        c2.setHp(c2.getHp() - rand.nextInt(c1.getPower()));
    }
}
