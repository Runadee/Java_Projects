package week_2.salaryCalculator;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    int tax() {
        double taxAmount = 0.0;
        if (this.salary >= 1000) {
            taxAmount = (this.salary * 0.3);

        }
        return (int) taxAmount;
    }

    double bonus() {
        double bonusAmount = 0.0;
        if (this.workHours > 40) {
            bonusAmount = (this.workHours - 40.0) * 30.0;
        }
        return bonusAmount;
    }

    double raiseSalary() {
        double raisedSalary = 0.0;
        if (this.hireYear > 2011) {
            raisedSalary = (this.salary * 0.5);
        } else if (this.hireYear < 2002) {
            raisedSalary = (this.salary * 0.15);
        } else if ((this.hireYear > 2002) && (this.hireYear < 2011)) {
            raisedSalary = (this.salary * 0.1);
        }
        return raisedSalary;
    }



    void print() {
        // Calculations requested from us
        double salaryTaxBonus = this.salary - tax() + bonus();
        double totalSalary = salaryTaxBonus + raiseSalary();

        System.out.println("-------------------------------");
        System.out.println("Name and Surname : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("work hours : " + this.workHours);
        System.out.println("Hire year: " + this.hireYear);
        System.out.println("Tax : " + tax());
        System.out.println("Bonus :" + bonus());
        System.out.println("Raised Salary Amount : " + raiseSalary());
        System.out.println("Salary with Tax and Bonus : " + salaryTaxBonus);
        System.out.println("Total Salary : " + totalSalary);
    }
}
