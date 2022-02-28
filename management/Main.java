package school.management;
/**
 * This part was done to show my methods and classes are working properly.
 * The most effective way to use the code is through a TUI or GUI,
 * this has been hard coded however
 *
 * TUI = text user interface
 * GUI = graphical user interface
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Lester = new Teacher(1,"Lester", 1000);
        Teacher Marisa = new Teacher(2, "Marrisa",1700);
        Teacher Vin = new Teacher(3,"Vin",1500);

        // Teacher list
        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(Lester);
        teachersList.add(Marisa);
        teachersList.add(Vin);

        Student Ben = new Student(1, "Ben", 3);
        Student Anuj = new Student(2, "Anuj", 4);
        Student Nicola = new Student(3, "Nicola", 2);
        List<Student> studentList = new ArrayList<>();

        // Student list
        studentList.add(Ben);
        studentList.add(Anuj);
        studentList.add(Nicola);

        School UofS = new School(teachersList, studentList);

        Teacher Sean = new Teacher(4, "sean", 1200);
        UofS.addTeacher(Sean);


        Anuj.payFees(8000);
        Ben.payFees(2000);
        System.out.println("UofS has earned $" + UofS.getTotalMoneyEarned());

        System.out.println("---UofS Pay Salary---");
        Lester.receiveSalary(Lester.getSalary());
        System.out.println("UofS paid salary to "
        + Lester.getName() + ", they now have $" + UofS.getTotalMoneyEarned());

        Vin.receiveSalary(Vin.getSalary());
        System.out.println("UofS paid salary to "
        + Vin.getName() + ", they now have $" + UofS.getTotalMoneyEarned());

        System.out.println(Anuj);

        Marisa.receiveSalary(Marisa.getSalary());
        System.out.println(Marisa);


    }

}
