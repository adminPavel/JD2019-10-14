package by.it.yaroshenko.testingNew1;


import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Manager extends Employee {

    private static List<Employee> directReports;

    public Manager(int id, String name, Date startDate, List<Employee> directReports) {
        super(id, name, startDate);
        this.directReports = directReports;
    }

    public Manager(Manager manager) {
        super(manager.id, manager.name, manager.startDate);
        this.directReports = manager.directReports.stream()
                .collect(Collectors.toList());
    }

    @Override
    public Employee copy() {
        return new Manager(this);
    }

    List<Employee> getDirectReport() {
        return this.directReports;
    }
    @Override public String toString()
    {

        return "(" + id + " + " + name + startDate + " " + directReports + ")";
    }

    public static void main(String[] args) throws Exception{
        Date date = new Date();
        //Employee employee = new Employee();
       //directReports.add();
        Employee source = new Manager(1, "Baeldung Manager", date, directReports);
        System.out.println(source);
       // System.out.println(source.copy());
        System.out.println();
    }

}