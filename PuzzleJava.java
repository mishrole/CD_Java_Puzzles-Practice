import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    Random randMachine = new Random();

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            result.add(randMachine.nextInt(20));
        }
        return result;
    }

    public String getRandomLetter() {
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        Integer index = randMachine.nextInt(25);
        return letters[index];
    }

    public String generatePassword() {
        String password = "";
        for(int i = 0; i < 8; i++) {
            password += getRandomLetter();
        }

        return password;
    }

    public String[] getNewPasswordSet(Integer longitude) {
        String[] passwords = new String[longitude];

        for(int i = 0; i < longitude; i++) {
            passwords[i] = generatePassword();
        }

        return passwords;
    }

    public String[] shuffleArray(String[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            Integer randomIndex = randMachine.nextInt(i + 1);
            String temporal = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temporal;
        }

        return array;
    }
}
