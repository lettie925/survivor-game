
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import Survivor.Character;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
        public static void main(String[] args) {
        System.out.println("These 16 Americans are beginning the adventure of a lifetime. They have volunteered to be marooned for 39 days. This is their story. This is survivor.");

        Scanner scanner = new Scanner(System.in);

        Character character = mainCharacter();
        String name = character.getCharacterName();
        String tribe = tribe();


        System.out.printf("%s you have been placed into the tribe %s.", name, tribe);

        

    }
        public static Character mainCharacter() {
            Scanner scanner = new Scanner(System.in);
        
            System.out.println("Enter survivor name: ");
            String name = scanner.nextLine();
    
            System.out.println("Enter survivor background: ");
            String background = scanner.nextLine();
    
            Character character = new Character(name, background);

            scanner.close();

            return character;
          
        }

        public static String tribe() {
            List<String> tribes = Arrays.asList("Aganoa", "Airai", "Aire", "Baka", "Baru-Baru", "Belo", "Coco", "Eku", "Fia Fia", "Fuego", "Kuna", "La Flor", "Reba", "Belo", "Lulu", "Sokka", "Water");
            Random random = new Random();
            return tribes.get(random.nextInt(tribes.size()));
        }
}
