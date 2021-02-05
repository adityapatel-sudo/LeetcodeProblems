package com.company.SchoolProblems;

/*
Demonstrates polymorphism by passing different types of employees as parameters
to the same method.
*/

/*
/*

									Employee
									40 hr/wk
									$40000.0 salary
									10 vacation days
									Yellow vacation form

	Secretary 		    Marketer			    Custodian				Lawyer
	takes dictations	$50000.0 salary 		80 hr/wk				15 vacation days
				        advertises			    $30000.0 salary	        Pink vacation form
								                5 vacation days
								                cleans
	Legal Secretary 										            HarvardLawyer
	$45000.0 salary 										            $48000.0 salary
	files legal briefs										            8 vacation days
													                    struts
*/

public class EmployeeClient {
    public static void main(String[] args) {

        Employee 		edna = new Employee();
        Secretary 		stan = new Secretary();
        LegalSecretary	leo  = new LegalSecretary();
        Marketer		mary = new Marketer();
        Lawyer			lucy = new Lawyer();

        printInfo(edna);
        printInfo(stan);
        printInfo(leo);
        printInfo(mary);
        printInfo(lucy);

        // the type of the reference variable does not have to match the
        // type of the object it refers to
        Employee 		jane = new Lawyer();		// OK
        // Lawyer 		john = new Employee();		// Not OK
        System.out.println(jane.getVacationForm());	// pink

        Employee 		jack = new Secretary();		// OK
        // jack.takeDictation("Hello!");				// not OK
        ((Secretary) jack).takeDictation("Hello!");
        // System.out.println( ((Secretary) jack).takeDictation("Hello!") ); // not OK
        printInfo(jack);
    }

    // Prints information about any kind of employee.
    // Polymorphism, aka "late binding," "virtual binding," and "dynamic dispatch"
    public static void printInfo(Employee e) {
        System.out.print(e.getHours() + ", ");
        System.out.printf("$%.2f, ", e.getSalary());
        System.out.print(e.getVacationDays() + ", ");
        System.out.print(e.getVacationForm() + ", ");
        System.out.println(e); // toString representation of employee
    }
}
class Employee{
    int hours;
    double salary;
    String vacationForm;
    int vacationDays;
    String job;

    public Employee(){
        this.hours = 40;
        this.salary = 40000.0;
        this.vacationDays = 10;
        this.vacationForm = "Yellow ";
    }

    public int getHours() {
        return hours;
    }

    public double getSalary() {
        return salary;
    }

    public String getVacationForm() {
        return vacationForm;
    }

    public int getVacationDays() {
        return vacationDays;
    }
    public String toString(){
        return this.getClass().getSimpleName();
    }

}
class Secretary extends Employee{
    String diction = "";
    public Secretary() {
        super();
        this.job = "takes dictations";
    }
    public void takeDictation(String diction){
        this.diction += diction;
    }
}
class LegalSecretary extends Secretary{
    public LegalSecretary(){
        super();
        this.salary = 45000.0;
        this.job = "files legal briefs";
    }
}
class Marketer extends Employee{
    public Marketer(){
        super();
        this.salary = 50000.0;
        this.job = "advertises";
    }
}
class Custodian extends Employee{

    public Custodian(){
        super();
        hours = 80;
        salary = 30000.0;
        vacationDays = 5;
        job = "cleans";
    }
}
class Lawyer extends Employee{

    public Lawyer(){
        super();
        vacationDays = 15;
        vacationForm = "pink";
    }
}
class HarvardLawyer extends Lawyer{
    public HarvardLawyer(){
        super();
        salary = 48000;
        vacationDays = 8;
        job = "struts";
    }
}