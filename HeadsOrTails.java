import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
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
    }
}
