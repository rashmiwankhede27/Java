import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class alphabet{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine().toUpperCase();

        boolean isPangram = checkPangram(sentence);

        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }

        scanner.close();
    }

    public static boolean checkPangram(String sentence) {
        // Create a set to store unique letters
        Set<Character> letterSet = new HashSet<>();

        // Iterate through the sentence
        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterSet.add(ch); // Add letters to the set
            }
        }

        // Check if the set contains all 26 letters
        return letterSet.size() == 26;
    }
}

