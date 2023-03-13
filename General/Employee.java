package General;

public class Employee {

    private int hours;
    private int salary;
    private String formcolor;
    private int vacationtime;

    public int publicvar;

    public Employee() {
        hours = 40;
        salary = 40000;
        formcolor = "yellow";
        vacationtime = 2;
    }

    int getHoursPerWeek() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }

    public String getFormColor() {
        return formcolor;
    }

    public int getVacationTime() {
        return vacationtime;
    }

    public String toString() {
        return "Vihan's employee class";

    }

}
