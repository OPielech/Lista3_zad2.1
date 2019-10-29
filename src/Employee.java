import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Employee {
    private final String name;
    private final String surname;
    private final LocalDate dateOfEmployment;
    private final int id;

    public Employee(String name, String surname, LocalDate dateOfEmployment, int id) {
        this.name = name;
        this.surname = surname;
        this.dateOfEmployment = dateOfEmployment;
        this.id = id;
    }//end of constructor

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Name: " + getName()
                + "\nSurname: " + getSurname()
                + "\nDate of employment: " + getDateOfEmployment()
                + "\nID number: " + getId()
                + "\n";
    }//end of toString

    public long seniority() {
        LocalDate now = LocalDate.now();
        return dateOfEmployment.until(now, ChronoUnit.DAYS);
    }//end of seniority

    public double weeklySalary() {
        return 0;
    }//end of weeklySalary


}//end of Employee
