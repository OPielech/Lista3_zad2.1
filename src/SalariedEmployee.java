import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, String surname, LocalDate dateOfEmployment, int id, double salary) {
        super(name, surname, dateOfEmployment, id);
        if (salary < 0)
            throw new IllegalArgumentException();
        else
            this.salary = salary;
    }//end of constructor

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double weeklySalary() {
        return (getSalary() / 30) * 7;
    }//end of weeklySalary

    @Override
    public String toString() {
        return "Name: " + getName()
                + "\nSurname: " + getSurname()
                + "\nDate of employment: " + getDateOfEmployment()
                + "\nID number: " + getId()
                + "\nSalary: " + getSalary()
                + "\n";
    }//end of toString
}//end of Employee
