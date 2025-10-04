import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;

import characters.Character;

import lombok.SneakyThrows;

public class CharacterFactory {
    private static Random rand = new Random();
    private static List<Class<? extends Character>> classes = new ArrayList<>();
    
    private static Reflections reflections = new Reflections();
    private static Set<Class<? extends Character>> allClasses = reflections.getSubTypesOf(Character.class);

    public CharacterFactory() {
        classes.addAll(allClasses);
    }

    @SneakyThrows
    Character createCharacter() {
        return classes.get(rand.nextInt(classes.size())).getConstructor().newInstance();
    }
}
