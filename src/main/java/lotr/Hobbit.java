package lotr;

import kickstrategy.CryKick;

public class Hobbit extends Character {
    public Hobbit() {
        super(3, 0, new CryKick());
    }
}
