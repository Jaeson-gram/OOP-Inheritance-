package com.Challenge;

public class Employee extends Worker{
    private int emloyeeId;
    private String hireDate;

    private static int employeeidNumber = 554900;

    public Employee(String name, String  birthDate, String hireDate) {
        super(name, birthDate);
        this.emloyeeId = employeeidNumber++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmployee Id - " + (emloyeeId) + "\nHire Date - " + hireDate;
    }
}
