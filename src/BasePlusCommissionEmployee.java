import java.time.LocalDate;

public class BasePlusCommissionEmployee extends Employee {
    private double provision;
    private double totalSaleAmount;
    private double baseSalary;

    public BasePlusCommissionEmployee(String name, String surname, LocalDate dateOfEmployment, int id, double provision,
                                      double totalSaleAmount, double baseSalary) {
        super(name, surname, dateOfEmployment, id);

        if (provision > 0 && provision < 1)
            this.provision = provision;
        else
            throw new IllegalArgumentException();

        if (totalSaleAmount < 0)
            throw new IllegalArgumentException();
        else
            this.totalSaleAmount = totalSaleAmount;

        if (baseSalary < 0)
            throw new IllegalArgumentException();
        else
            this.baseSalary = baseSalary;
    }//end of constructor

    public double getProvision() {
        return provision;
    }

    public void setProvision(double provision) {
        this.provision = provision;
    }

    public double getTotalSaleAmount() {
        return totalSaleAmount;
    }

    public void setTotalSaleAmount(double totalSaleAmount) {
        this.totalSaleAmount = totalSaleAmount;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double weeklySalary() {
        return (getBaseSalary() / 30) * 7;
    }//end of weeklySalary

    public double earnings() {
        return (weeklySalary() + getProvision() * getTotalSaleAmount());
    }//end of earnings

    @Override
    public String toString() {
        return "Name: " + getName()
                + "\nSurname: " + getSurname()
                + "\nDate of employment: " + getDateOfEmployment()
                + "\nID number: " + getId()
                + "\nProvision: " + getProvision()
                + "\nTotal sale amount: " + getTotalSaleAmount()
                + "\nBase salary: " + getBaseSalary()
                + "\n";
    }//end of toString
}//end of class
