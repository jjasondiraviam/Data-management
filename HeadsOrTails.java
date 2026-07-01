import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who are you?");
        System.out.print("> ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        Random rand = new Random();
        int headsCount = 0;
        int tailsCount = 0;

        System.out.println("Tossing a coin...");
        for (int i = 1; i <= 3; i++) {
            String result = rand.nextBoolean() ? "Heads" : "Tails";
            System.out.println("Round " + i + ": " + result);
            
            if (result.equals("Heads")) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }
        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);

        
        if (headsCount > tailsCount) {
            System.out.println(name + " won!");
        } else {
            System.out.println(name + " lost!");
        }
    }
}