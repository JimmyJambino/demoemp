package com.company;

public class EmpBusinessLogic {

    public double calculateYearlySalary(EmployeeDetails employeeDetails) {
        double yearlySalary = 0;
        yearlySalary = employeeDetails.getMonthlySalary() * 12;
        return yearlySalary;
    }

    public double calculateAppraisal(EmployeeDetails employeeDetails) {
        double appraisal = 0;
        if (employeeDetails.getMonthlySalary() < 40000) {
            appraisal = 500;
        } else {
            appraisal = 1000;
        }
        return appraisal;
    }

    public double calculateYearlyPension(EmployeeDetails employeeDetails) {
        double pensionRate = 0;
        double pensionTotal = 0;
        int age = employeeDetails.getAge();
        if(age < 25) {
            pensionRate = 0;
        } else if(age >= 25 && age < 40) {
            pensionRate = 0.1;
        } else {
            pensionRate = 0.2;
        }
        pensionTotal = calculateYearlySalary(employeeDetails)*pensionRate;
        return pensionTotal;
    }
}
