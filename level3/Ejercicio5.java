package level3;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {

    public static class Student {
        private String lastName;
        private String name;
        private LocalDate birthday;
        
        public Student(String lastName, String name, LocalDate birthday) {
            this.lastName = lastName;
            this.name = name;
            this.birthday = birthday;
        }
        public String getLastName() {
            return lastName;
        }
        public String getName() {
            return name;
        }
        public LocalDate getBirthday() {
            return birthday;
        }
        public String fullName() {
            return this.getLastName() + " " + this.getName();
        }
        public Integer getAge() {
            return Period.between(this.getBirthday(),LocalDate.now()).getYears();
        }
    }

    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("Gomez", "Mario",LocalDate.of(2001,05,16)),
            new Student("Perez", "Maria",LocalDate.of(1997,01,13)),
            new Student("Sanchez", "Marta",LocalDate.of(2008,02,28)),
            new Student("Lopez", "Mauro",LocalDate.of(1975,07,30)),
            new Student("Fernandez", "Melisa",LocalDate.of(1988,10,02))
        );

        Map<String,Integer> ages = new HashMap<>();

        students
            .stream()
            .forEach(s -> ages.put(
                s.fullName(),s.getAge()
            ));
            
        System.out.println(ages);
    }
}
