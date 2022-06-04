package level3;

import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> words = List
            .of("Batman", "Aqbman", "Flash", "Batgirl", "Wonder Woman", "brainiac");

        long wordsWithB = words
            .stream()
            .filter(w -> w.matches("(B|b).*"))
            .count();

        System.out.println(wordsWithB);
    }
}
