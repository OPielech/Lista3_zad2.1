import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int numberOfHoursWorkedInWeek;

    public HourlyEmployee(String name, String surname, LocalDate dateOfEmployment, int id, double hourlyRate,
                          int numberOfHoursWorkedInWeek) {
        super(name, surname, dateOfEmployment, id);

        if (hourlyRate < 0)
            throw new IllegalArgumentException();
        else
            this.hourlyRate = hourlyRate;

        if (numberOfHoursWorkedInWeek > 0 && numberOfHoursWorkedInWeek <= 168)
            this.numberOfHoursWorkedInWeek = numberOfHoursWorkedInWeek;
        else
            throw new IllegalArgumentException();
    }//end of constructor

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNumberOfHoursWorkedInWeek() {
        return numberOfHoursWorkedInWeek;
    }

    public void setNumberOfHoursWorkedInWeek(int numberOfHoursWorkedInWeek) {
        this.numberOfHoursWorkedInWeek = numberOfHoursWorkedInWeek;
    }

    public double earnings() {
        double earnings;
        if (getNumberOfHoursWorkedInWeek() > 40) {
            earnings = 40 * getHourlyRate() + (getNumberOfHoursWorkedInWeek() - 40) * (getHourlyRate() * 1.1);
        }//end of if

        else
            earnings = getNumberOfHoursWorkedInWeek() * getHourlyRate();
        return earnings;
    }//end of earnings

    @Override
    public String toString() {
        return "Name: " + getName()
                + "\nSurname: " + getSurname()
                + "\nDate of employment: " + getDateOfEmployment()
                + "\nID number: " + getId()
                + "\nHourly rate: " + getHourlyRate()
                + "\nNumber of hours worked in week: " + getNumberOfHoursWorkedInWeek()
                + "\n";
    }//end of toString
}//end of class

