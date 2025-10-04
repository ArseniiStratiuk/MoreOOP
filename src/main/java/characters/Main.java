package characters;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Character[] characters = {
            new Elf(),
            new Hobbit()
        };

        Class<Elf> eltype = Elf.class;
        Class<Hobbit> hobClass = Hobbit.class;
        Class<? extends Character> newE1 = eltype;
        List<Class<? extends Character>> lst = new ArrayList<>();

        lst.add(Elf.class);
        lst.add(Hobbit.class);

        Reflections reflections = new Reflections("characters");
        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);

        for (Class<? extends Character> cls : subTypes) {
            System.out.println(cls.getName());
        }

        // Convert to list
        List<Class<? extends Character>> lstSubTypes = new ArrayList<>();
        lstSubTypes.addAll(subTypes);
        Class<? extends Character> firstSubType = lstSubTypes.get(new Random().nextInt(lstSubTypes.size()));
        System.out.println(firstSubType.getName());

        Character c1 = firstSubType.getDeclaredConstructor().newInstance();
        System.out.println(c1.getClass().getName() + " created with hp=" + c1.getHp() + " and power=" + c1.getPower());
    }
}
