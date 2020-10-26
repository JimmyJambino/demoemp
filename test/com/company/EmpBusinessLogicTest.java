package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpBusinessLogicTest {
    EmployeeDetails employeeDetails = new EmployeeDetails();
    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    @Test
    void calculateYearlySalary() {
        employeeDetails.setMonthlySalary(30000);
        assertEquals(360000,empBusinessLogic.calculateYearlySalary(employeeDetails),0.001);
    }

    @Test
    void calculateAppraisal() {
        employeeDetails.setMonthlySalary(10000); // < 40000 -> 500, else 1000
        double appraisal = empBusinessLogic.calculateAppraisal(employeeDetails);
        assertEquals(500, appraisal);
        employeeDetails.setMonthlySalary(50000);
        appraisal = empBusinessLogic.calculateAppraisal(employeeDetails);
        assertEquals(1000, appraisal);
    }

    @Test
    void calculateYearlyPension() {
        employeeDetails.setMonthlySalary(10000);
        employeeDetails.setAge(20);
        double pension = empBusinessLogic.calculateYearlyPension(employeeDetails);
        double pension20 = empBusinessLogic.calculateYearlySalary(employeeDetails)*0;
        double pension25 = empBusinessLogic.calculateYearlySalary(employeeDetails)*0.1;
        double pension39 = empBusinessLogic.calculateYearlySalary(employeeDetails)*0.1;
        double pension40 = empBusinessLogic.calculateYearlySalary(employeeDetails)*0.2;

        assertEquals(pension20,pension);

        employeeDetails.setAge(25);
        pension = empBusinessLogic.calculateYearlyPension(employeeDetails);
        assertEquals(pension25,pension);

        employeeDetails.setAge(39);
        pension = empBusinessLogic.calculateYearlyPension(employeeDetails);
        assertEquals(pension39,pension);

        employeeDetails.setAge(40);
        pension = empBusinessLogic.calculateYearlyPension(employeeDetails);
        assertEquals(pension40,pension);



    }
}