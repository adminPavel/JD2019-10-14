package by.it.yaroshenko.testing;

import java.util.Date;

public class Employee{
    protected int id;
    protected String name;
    private Date startDate;
    public Employee (int id, String name, Date startDate) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
    }
    public Employee (Employee employee) {
        this.id = employee.id;
        this.name = employee.name;
        this.startDate = new Date(employee.startDate.getTime());
    }
    Date getStartDate() {
        return startDate;
    }
    public Employee copy() {
        return new Employee(this);
    }
    @Override public String toString()
    {

        return "(" + id + " + " + name + startDate + ")";
    }
    public static void main(String[] args) {
        Date date = new Date();
     //Employee employee = new Employee(4, "I", date.getTime());
        Employee employee1 = new Employee(4, "IO", date);
        Employee employee2 = new Employee(employee1);
        System.out.println(employee2);
        System.out.println(date.getTime());
        System.out.println(employee1);
        System.out.println(employee1.copy());
        System.out.println(employee1.getStartDate());

    }
}
