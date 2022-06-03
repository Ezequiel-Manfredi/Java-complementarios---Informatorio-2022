package level2;

import java.util.ArrayList;

public class Ejercicio7 {
    public static ArrayList<String> fizzBuzzFunction(int start,int end) {
        ArrayList<String> sequence = new ArrayList<>();
        String text;
        for (int i = start; i < end; i++) {
            text = "";
            if (i % 2 == 0) text += "Fizz";
            if (i % 3 == 0) text += "Buzz";
            if (text == "") sequence.add(String.valueOf(i));
            else sequence.add(text);
        }
        return sequence;
    }
    public static void main(String[] args) {
        System.out.println(fizzBuzzFunction(1,6));
        System.out.println(fizzBuzzFunction(1,8));
    }
}
