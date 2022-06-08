package level2;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void print(ArrayList<Integer> numbers) {
        for (Integer integer : numbers) {
            System.out.print(integer + " ");
        }
        System.out.println("\nlength: " + numbers.size());
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= 6; i++) {
            numbers.add(i);
        }
    
        print(numbers);
    
        numbers.add(0,1);
        numbers.add(numbers.size(),7);

        print(numbers);
    }
}
