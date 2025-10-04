import lotr.Character;
import lotr.Elf;
import lotr.Knight;
import lotr.Hobbit;
import lotr.King;

public class Demo {
    public static void main(String args[]) {
        GameManager gameManager = new GameManager();
        CharacterFactory factory = new CharacterFactory();
        
        // Create characters
        Character elf = new Elf();
        Character knight = new Knight();
        Character hobbit = new Hobbit();
        Character king = new King();
        
        // Fight 1: Elf vs Knight
        gameManager.fight(elf, knight);
        
        // Fight 2: King vs Hobbit
        gameManager.fight(king, hobbit);
        
        // Fight 3: Random vs Random
        Character random1 = factory.createCharacter();
        Character random2 = factory.createCharacter();
        gameManager.fight(random1, random2);
    }
}
