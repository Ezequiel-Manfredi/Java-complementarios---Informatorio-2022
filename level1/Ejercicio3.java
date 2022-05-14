import java.util.Scanner;

public class Ejercicio3 {
    public static void numberSequence(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();

        numberSequence(number);
    }
}
