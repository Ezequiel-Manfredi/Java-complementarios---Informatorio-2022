package level2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            cards.add(i);
        }
        
        System.out.println(cards);
        Collections.reverse(cards);
        System.out.println(cards);
        Collections.shuffle(cards);
        System.out.println(cards);
    }
}
