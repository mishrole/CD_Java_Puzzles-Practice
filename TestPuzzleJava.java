import java.util.ArrayList;
import java.util.Arrays;

public class TestPuzzleJava {
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        String randomLetter = generator.getRandomLetter();
        System.out.println(randomLetter);

        String randomPassword = generator.generatePassword();
        System.out.println(randomPassword);

        String[] randomSet = generator.getNewPasswordSet(8);
        System.out.println(Arrays.toString(randomSet));

        String[] data = {"Manzana", "Plátano", "Mango", "Pera", "Fresa", "Naranja"};
        String[] randomShuffle = generator.shuffleArray(data);
        System.out.println(Arrays.toString(randomShuffle));
    }
}