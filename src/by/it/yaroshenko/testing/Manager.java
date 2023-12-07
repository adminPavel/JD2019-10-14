package by.it.yaroshenko.testing;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Manager extends Employee{
        private static List<Employee> directReports;
        public Manager (int id, String name, Date startDate, List<Employee> directReports) {
            super (id, name, startDate);
            this.directReports = directReports;
        }
        public Manager (Manager manager) {
            super(manager.id, manager.name, manager.getStartDate());
            directReports = manager.directReports.stream()
                    .collect(Collectors.toList());
        }
        @Override
        public Employee copy() {
            return new Manager(this);
        }
    List<Employee> getDirectReport() {
        return this.directReports;
    }
    public static void main(String[] args) {
        Date date = new Date();
        Employee source = new Manager(1, "Baeldung Manager", date, directReports);
       // Employee clone = new Manager((Manager) source);
        Employee clone = source.copy();
        System.out.println(clone);
          }
}
