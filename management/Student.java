//Anuj Brahmania
package school.management;

/**
 * This class is responsible for keeping track
 * of the student fees, fees paid, name & year the student is enrolled in
 */
public class Student {

    private int id;
    private String name;
    private int year;
    private int feesPaid;
    private int feesTotal;

    /**
     * Fees for every student is $10,000 / year.
     * Fess paid initially is 0.
     * To create a new student by initializing.
     * @param id id for student that will be unique.
     * @param name name of student.
     * @param year year of student.
     */
    // Initializing everything from the class
    public Student(int id, String name, int year) {
        feesPaid = 0;
        feesTotal = 10000;
        this.id = id;
        this.name = name;
        this.year = year;

    }

    // Not going to alter student's name or student id.

    /**
     * used to update student's grade.
     * @param year new year of the student.
     */
    public void setGrade(int year){
        this.year = year;

    }

    /**
     * Continuously add fees to feesPaid
     * Add the fees to fees paid
     * School is going to receive the funds.
     *
     * @param fees the fees that the student pays.
     */
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);

    }

    /**
     *
     * @return id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return  name of student.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return grade of student
     */
    public int getYear() {
        return year;
    }

    /**
     * fees paid by the student.
     * @return
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return total feels of student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees.
     */
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "student's name : " + name +
                ", total fees paid so far $" + feesPaid;
    }
}
