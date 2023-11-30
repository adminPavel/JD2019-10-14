package by.it.yaroshenko.testing;

import java.io.PrintStream;

public class Student {
    private String name;
    private int age;

    public Student (String name) {
        this (20);
        System.out.println("Name of Student : " + name);
    }
    public Student (int age) {
        System.out.println("Age of student = " + age);
    }
    public Student() {
        this ("Geeks");
    }


    public static void main(String[] args) {
        Student student = new Student();

    }
}
