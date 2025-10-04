public class GameManager {
    
    public void fight(lotr.Character c1, lotr.Character c2) {
        System.out.println("\n=== Battle Start ===");
        System.out.println(c1.getClass().getSimpleName() + " (HP: " + c1.getHp() + ", Power: " + c1.getPower() + ")");
        System.out.println("    VS");
        System.out.println(c2.getClass().getSimpleName() + " (HP: " + c2.getHp() + ", Power: " + c2.getPower() + ")");
        System.out.println("===================\n");
        
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " attacks!");
            c1.kick(c2);
            System.out.println(c2.getClass().getSimpleName() + " HP: " + c2.getHp());
            
            if (!c2.isAlive()) {
                break;
            }
            
            System.out.println(c2.getClass().getSimpleName() + " attacks!");
            c2.kick(c1);
            System.out.println(c1.getClass().getSimpleName() + " HP: " + c1.getHp());
            System.out.println();
        }
        
        System.out.println("=== Battle End ===");
        if (c1.isAlive()) {
            System.out.println("Winner: " + c1.getClass().getSimpleName());
        } else {
            System.out.println("Winner: " + c2.getClass().getSimpleName());
        }
        System.out.println("==================\n");
    }
}
