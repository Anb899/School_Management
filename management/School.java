package school.management;

import java.util.List;
/**
 * Multiple teachers, students.
 * Implement teachers and students using
 * an ArrayList.
 */
public class School {


    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created.
     * @param teachers list of teachers in the school
     * @param student list of students in the school
     */

    public School(List<Teacher> teachers, List<Student> student) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;

    }

    /**
     *
     * @return the list of teachers in the school.
     */

    public List<Teacher> getTeacher() {
        return teachers;
    }

    /**
     * Add a teacher to the school
     * @param teacher the teacher thats going to be added.
     */

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school
     */

    public List<Student> getStudent() {
        return students;
    }

    /**
     * Adds a student to the school.
     * @param student the student to be added.
     */

    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money earned by the school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by school.
     * @param MoneyEarned money that is supposed to be added.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Update the money that is spent by the school.
     * The salary given by the school to the teachers
     *
     * @param MoneySpent the money spent by the school
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;

    }
}
