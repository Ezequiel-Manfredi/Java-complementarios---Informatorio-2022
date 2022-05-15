import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= 6; i++) {
            numbers.add(i);
        }
    
        numbers.add(0,1);
        numbers.add(numbers.size(),7);

        System.out.println(numbers);
    }
}
