package level1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        scan.close();
        
        System.out.println("HOLA " + user + "!!!");
    }
}
