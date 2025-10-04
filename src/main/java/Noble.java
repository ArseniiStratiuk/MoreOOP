import java.util.Random;

import characters.Character;

public abstract class Noble extends Character {
    public static Random RANDOM_GENERATOR = new Random();

    public Noble(int min, int max) {
        super(RANDOM_GENERATOR.nextInt(max - min + 1) + min, RANDOM_GENERATOR.nextInt(max - min + 1) + min);
    }

    @Override
    public void kick(Character c) {
        int damage = RANDOM_GENERATOR.nextInt(getPower()) + 1; // random damage from 1 to power
        int newHp = c.getHp() - damage;
        c.setHp(newHp);
        System.out.println(this.getClass().getSimpleName() + " deals " + damage + " damage!");
    }
    
}
