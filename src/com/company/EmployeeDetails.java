package com.company;

public class EmployeeDetails {
    private String name;
    private double monthlySalary;
    private int age;

    // name get-set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // monthlySalary get-set
    public double getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    // age get-set
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
