package com.Challenge;

import java.util.Locale;
public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;


    public SalariedEmployee(String name, String BirthDate, String hireDate, double annualSalary) {
        super(name, BirthDate, hireDate);
        this.annualSalary = annualSalary;
//        this.isRetired = Integer.parseInt(endDate.substring(6)) <= 2023;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEmployee Type - Salaried Employee \nAnnual Salary - "
                + (annualSalary) + "\nRetired - " + isRetired;
    }

    @Override
    public double collectPay(){

        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired)? .9* paycheck : paycheck;
        return  (int) adjustedPay;
    }

    public void retire(){
        terminate("12/12/2025");
        isRetired = true;
    }

}
