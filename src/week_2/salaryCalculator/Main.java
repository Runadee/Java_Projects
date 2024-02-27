package week_2.salaryCalculator;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Sam Pat", 3000, 40, 2005);
        Employee employee2 = new Employee("Jack Pol", 2500, 52, 2018);
        Employee employee3 = new Employee("Samuel Soul", 3000, 50, 2003);

        employee1.print();
        employee2.print();
        employee3.print();

    }
}
