import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static ArrayList<List<String>> classDivision(ArrayList<String> students) {
        int size = students.size();
        int part1 = size/3;
        int part2 = part1*2;
        
        ArrayList<List<String>> classList = new ArrayList<>();
        classList.add(students.subList(0, part1));
        classList.add(students.subList(part1, part2));
        classList.add(students.subList(part2, size));
        return classList;
    }
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            students.add("estudiante"+i);
        }

        ArrayList<List<String>> classList = classDivision(students);

        for (int i = 0; i < classList.size(); i++) {
            System.out.println("clase " + (i + 1) +": " + classList.get(i));
        }
    }
}
