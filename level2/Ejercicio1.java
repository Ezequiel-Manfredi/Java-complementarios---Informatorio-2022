import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> cities = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            String city = scan.nextLine();
            cities.add("#" + i + " " + city);
        }
        scan.close();

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
