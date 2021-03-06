package school.management;

/**
 * This class is responsible for keeping track of
 * teachers id, name, and salary.
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new Teacher object
     *
     * @param id     id for teacher.
     * @param name   name of teacher.
     * @param salary salary of the teacher.
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;

    }

    /**
     *
     * @return id of the teacher.
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return name of teacher.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the salary of the teacher.
     */
     public int getSalary(){
        return salary;
     }

    /**
     * Set the salary
     * @param salary
     */
     public void setSalary(int salary){
         this.salary = salary;
     }

    /**
     * Adds to salaryEarned
     * Remove from the total money earned by the school.
     * @param salary
     */
     public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the Teacher: " + name +
        "Total salary earned so far $" + salaryEarned;
    }
}
