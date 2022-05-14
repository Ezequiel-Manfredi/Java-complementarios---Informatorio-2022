import java.util.Scanner;

public class Ejercicio5 {
    public static int multiply(int number1,int number2) {
        int result = 0;
        for (int i = 0; i < number2; i++) {
            result += number1;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        scan.close();

        System.out.println(String.format("%s * %s = %s",number1,number2,multiply(number1,number2)));
    }
}
