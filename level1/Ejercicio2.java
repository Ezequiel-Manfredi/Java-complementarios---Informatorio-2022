import java.util.Scanner;

public class Ejercicio2 {
    public static void operationList(int number1,int number2) {
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        scan.close();

        operationList(number1,number2);
    }
}
