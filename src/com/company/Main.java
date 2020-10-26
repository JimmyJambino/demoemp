package com.company;

public class Main {

    public static void main(String[] args) {
        EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
        EmployeeDetails employeeDetails = new EmployeeDetails();

        employeeDetails.setName("Børge");
        employeeDetails.setMonthlySalary(30000);
        employeeDetails.setAge(30);

        double salary = empBusinessLogic.calculateYearlySalary(employeeDetails);
        double appraisal = empBusinessLogic.calculateAppraisal(employeeDetails);

        System.out.printf("%s har en månedlig løn på %,.0f, hvilket giver en årlig løn på %,.0f. Tilæg er på %,.0f",
                employeeDetails.getName(),employeeDetails.getMonthlySalary(),salary,appraisal);

        System.out.println("test for github");
    }
}
