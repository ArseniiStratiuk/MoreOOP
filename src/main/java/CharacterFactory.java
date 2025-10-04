import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import characters.Elf;
import characters.Hobbit;
import characters.King;
import characters.Knight;
import characters.Character;

import lombok.SneakyThrows;

public class CharacterFactory {
    private static final Random rand = new Random();
    private static List<Class<? extends Character>> classes = new ArrayList<>();

    public CharacterFactory() {
        classes.add(Hobbit.class);
        classes.add(Elf.class);
        classes.add(King.class);
        classes.add(Knight.class);
    }

    @SneakyThrows
    Character createCharacter() {
        return classes.get(rand.nextInt(classes.size())).getConstructor().newInstance();
    }

}
