import java.util.Scanner;

public class Ejercicio4 {
    public static int factorial(int number) {
        return (number <= 1) ? 1 : number * factorial(number - 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();

        System.out.println(String.format(
            "El factorial de %s es: %s",
            number,
            factorial(number)
        ));
    }
}
