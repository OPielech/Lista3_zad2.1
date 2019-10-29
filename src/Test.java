import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Staff staff = new Staff();

        Employee e1 = new Employee("Oskar", "Pielech", LocalDate.parse("2019-09-25"), 1234);
        System.out.println(e1.seniority());
        System.out.println(e1.toString());

        System.out.println();
        HourlyEmployee e2 = new HourlyEmployee(e1.getName(), e1.getSurname(), e1.getDateOfEmployment(), e1.getId(), 15, 48);
        System.out.println(e2.toString());
        System.out.println(e2.earnings());
        System.out.println(e2.seniority());

        System.out.println();
        SalariedEmployee e3 = new SalariedEmployee(e1.getName(), e1.getSurname(), e1.getDateOfEmployment(), e1.getId(), 100000);
        System.out.println(e3.toString());
        System.out.printf("%.2f\n", e3.weeklySalary());

        System.out.println("");
        CommissionEmployee e4 = new CommissionEmployee(e1.getName(), e1.getSurname(), e1.getDateOfEmployment(), e1.getId(), 0.5, 100000);
        System.out.println(e4.toString());
        System.out.printf("%.2f\n", e4.earnings());

        System.out.println("");
        BasePlusCommissionEmployee e5 = new BasePlusCommissionEmployee(e1.getName(), e1.getSurname(), e1.getDateOfEmployment(), e1.getId(), 0.5, 100000, 100000);
        System.out.println(e5.toString());
        System.out.printf("%.2f\n", e5.earnings());

        staff.add(e1);
        staff.add(e2);
        staff.add(e3);
        staff.add(e4);
        staff.add(e5);

        staff.printList();
//        staff.printSeniority();


    }//end of main
}//end of class
