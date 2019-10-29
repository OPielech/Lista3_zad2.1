import java.time.LocalDate;
import java.util.ArrayList;

public class Staff {
    private ArrayList<Employee> list = new ArrayList();

    public void add(Employee employee) {
        list.add(employee);
    }//end of addToList

    public void deleteFromList(Employee employee) {
        list.remove(employee);
    }//end of deleteFromList

    public void printList() {
        int i = 1;
        for (Employee employee : list) {
            System.out.println("Employee " + (i) + ":");
            System.out.println(employee.toString());
            System.out.println();
            i++;
        }//end of for
    }//end of printList

    public void printSeniority() {
        int i = 1;
        for (Employee employee : list) {
            System.out.println("Employee " + (i) + ":");
            System.out.println("Seniority: " + employee.seniority());
            System.out.println();
            i++;
        }//end of for
    }//end of printSeniority

//    public void printWeeklySalary(){
//        int i=1;
//        for (Employee employee:list) {
//            if (list.contains("Salary:")||list.contains())
//            System.out.println("Employee " + (i) + ":");
//            System.out.println(employee.);
//            System.out.println();
//            i++;
//        }//end of for
//    }//end of printWeeklySalary
}//end of class
