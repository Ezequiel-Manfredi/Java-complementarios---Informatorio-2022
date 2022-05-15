import java.util.ArrayList;

public class Ejercicio5 {
    public static void loadArrays(ArrayList<Integer> hoursWorked,ArrayList<Integer> valuePerHour) {
        hoursWorked.add(6);
        hoursWorked.add(7);
        hoursWorked.add(8);
        hoursWorked.add(4);
        hoursWorked.add(5);
        
        valuePerHour.add(350);
        valuePerHour.add(345);
        valuePerHour.add(550);
        valuePerHour.add(600);
        valuePerHour.add(320);
    }
    public static void main(String[] args) {
        ArrayList<Integer> hoursWorked = new ArrayList<>();
        ArrayList<Integer> valuePerHour = new ArrayList<>();
        loadArrays(hoursWorked,valuePerHour);

        ArrayList<Integer> totalsToPay = new ArrayList<>();
        int payment = 0;
        for (int i = 0; i < hoursWorked.size(); i++) {
            int pay = hoursWorked.get(i)*valuePerHour.get(i);
            payment += pay;
            totalsToPay.add(pay);
        }

        System.out.println("subtotales: " + totalsToPay);
        System.out.println("total final: $" + payment);
    }
}
