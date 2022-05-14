import java.util.Scanner;

public class Ejercicio7 {
    private static void upperCase(String text) {
        char[] characters = text.toCharArray();
        for (char character : characters) {
            int lower = (int)character;
            int upper = lower - 32;
            System.out.print((char)upper);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        scan.close();

        upperCase(text);
    }
}
