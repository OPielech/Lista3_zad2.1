import java.time.LocalDate;

public class CommissionEmployee extends Employee {
    private double provision;
    private double totalSaleAmount;

    public CommissionEmployee(String name, String surname, LocalDate dateOfEmployment, int id, double provision,
                              double totalSaleAmount) {
        super(name, surname, dateOfEmployment, id);

        if (provision > 0 && provision < 1)
            this.provision = provision;
        else
            throw new IllegalArgumentException();

        if (totalSaleAmount < 0)
            throw new IllegalArgumentException();
        else
            this.totalSaleAmount = totalSaleAmount;

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

    public double earnings() {
        return getTotalSaleAmount() * getProvision();
    }//end of earnings

    @Override
    public String toString() {
        return "Name: " + getName()
                + "\nSurname: " + getSurname()
                + "\nDate of employment: " + getDateOfEmployment()
                + "\nID number: " + getId()
                + "\nProvision: " + getProvision()
                + "\nTotal sale amount: " + getTotalSaleAmount()
                + "\n";
    }//end of toString
}//end of class
