package kickstrategy;

import lotr.Character;

public class ElfKick implements KickStrategy {
    @Override
    public void kick(Character c1, Character c2) {
        if (c2.getPower() < c1.getPower()) {
            c2.setHp(0);
        }
        else {
            c2.setPower(c2.getPower() - 1);
        }
    }
}
