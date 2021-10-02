package com.ttn.java.Java8;


@java.lang.FunctionalInterface
interface EmployeeReference
{
    Employee EmployeeDetails(String empName, int empAge, String empCity);
}

public class Employee
{
    String employeeName;
    int employeeAge;
    String employeeCity;

    Employee(String emp_Name, int emp_Age, String emp_City) {
        this.employeeName = emp_Name;
        this.employeeAge = emp_Age;
        this.employeeCity = emp_City;
    }

    void getEmployee()
    {
        System.out.println(this.employeeName + " aged " + this.employeeAge + " stays at " + this.employeeCity + ".");
    }

    public static void main(String[] args) {
        EmployeeReference employeeReference = Employee::new;
        Employee employee = employeeReference.EmployeeDetails("Swati Panwar", 30, "Noida");
        employee.getEmployee();
    }
}
