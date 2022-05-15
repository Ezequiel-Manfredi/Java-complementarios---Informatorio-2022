import java.util.HashMap;
import java.util.HashSet;

public class Ejercicio6 {
    public static class Empleados {
        String nameLastname;
        Long DNI;
        Integer hoursWorked;
        Integer valuePerHour;

        public Empleados(String nameLastname, Long DNI, Integer hoursWorked, Integer valuePerHour) {
            this.nameLastname = nameLastname;
            this.DNI = DNI;
            this.hoursWorked = hoursWorked;
            this.valuePerHour = valuePerHour;
        }
    }
    public static void main(String[] args) {
        HashSet<Empleados> employeeList = new HashSet<>();
        employeeList.add(new Empleados("nombre1",12345678L,16,400));
        employeeList.add(new Empleados("nombre2",12335678L,5,250));
        employeeList.add(new Empleados("nombre3",12344678L,8,300));
        employeeList.add(new Empleados("nombre4",12345578L,4,200));

        HashMap<Long,Integer> salaryList = new HashMap<>();
        for (Empleados employee : employeeList) {
            salaryList.put(employee.DNI, (employee.hoursWorked * employee.valuePerHour));
        }

        System.out.println(salaryList);
    }
}
