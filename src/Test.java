import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Staff staff = new Staff();

        Employee e1 = new Employee("Jan", "Kowalski", LocalDate.parse("2017-09-25"), 1234);
        HourlyEmployee e2 = new HourlyEmployee("Adam","Nowak",LocalDate.parse("2016-05-04"),4321
                ,18.5,48);
        SalariedEmployee e3 = new SalariedEmployee("Kuba","Polski",LocalDate.parse("2019-01-05")
                ,1324,10000);
        CommissionEmployee e4 = new CommissionEmployee("Jacek","Kowal",LocalDate.parse("2016-05-06")
                ,1423,0.2,30000);
        BasePlusCommissionEmployee e5 = new BasePlusCommissionEmployee("Marcin","Wysoki"
                ,LocalDate.parse("2016-03-05"),4231,0.15,30000,5000);

        staff.addToList(e1);
        staff.addToList(e2);
        staff.addToList(e3);
        staff.addToList(e4);
        staff.addToList(e5);

        staff.printList();
        staff.printSeniority();
        staff.printWeeklySalary();


    }//end of main
}//end of class
