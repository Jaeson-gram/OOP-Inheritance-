package com.Challenge;

public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthYear, String hireDate, double hourlyPayRate) {
        super(name, birthYear, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEmployee Type - Hourly Employee \nHourly Pay Rate - "
                + (hourlyPayRate);
    }

    @Override
    public double collectPay(){
        return 40 * hourlyPayRate; //works 40hrs a week...
    }
    public void getDoublePay(){
        System.out.println("Paid double. Pay - " + collectPay() * 2);
    }

}
