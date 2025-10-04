package characters;

import lombok.AllArgsConstructor;
import lombok.Getter;

import kickstrategy.KickStrategy;

@AllArgsConstructor
public abstract class Character {
    @Getter
    private int hp;
    
    @Getter
    private int power;

    private KickStrategy kickStrategy;

    public boolean isAlive() {
        return hp > 0;
    }

    public void kick(Character character) {
        kickStrategy.kick(this, character);
    }

    public void setHp(int hp) {
        this.hp = hp > 0 ? hp : 0;
    }

    public void setPower(int power) {
        this.power = power > 0 ? power : 0;
    }
}
