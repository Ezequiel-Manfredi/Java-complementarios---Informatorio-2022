package level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hola");
        words.add(null);
        words.add("Informatorio");
        words.add("");

        
        List<String> filtredWords = words
            .stream()
            .map(w-> Optional.ofNullable(w).orElse(""))
            .filter(e -> !e.isEmpty())
            .collect(Collectors.toList());
        
        System.out.println(filtredWords);
    }
}
