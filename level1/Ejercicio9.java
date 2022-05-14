import java.util.Scanner;

public class Ejercicio9 {
    public static int counterMatch(String text,char letter) {
        char[] letters = text.toCharArray();
        int result = 0;
        for (char c : letters) {
            if (c == letter) result++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        char letter = (scan.nextLine()).charAt(0);
        scan.close();

        System.out.println(counterMatch(text,letter));
    }
}
