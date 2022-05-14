import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String age = scan.nextLine();
        String address = scan.nextLine();
        String city = scan.nextLine();
        scan.close();

        System.out.println(String.format("%s - %s - %s - %s",city,address,age,name));
    }
}
