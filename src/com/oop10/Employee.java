package com.oop10;

public class Employee {

    int employeeNumber; // 고유 사원 번호
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
        this.employeeNumber = Company.empSerialNumber;
        Company.empSerialNumber++;
    }

    public int getNumber() {
        return employeeNumber;
    }

}
