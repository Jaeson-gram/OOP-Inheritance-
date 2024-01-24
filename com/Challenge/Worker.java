package com.Challenge;

public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString(){
        return "Name - " + name + "\nAge - " + (2024 - Integer.parseInt(birthDate.substring(6))) + "\nEnd Date - " + endDate;
    }

    public int getAge(){
        int birthYear = Integer.parseInt(birthDate.substring(6)); //assuming they're only in the format dd/mm/yy

        return 2025 - birthYear;
    }

    public double collectPay(){
        return 0;
    }

    public void terminate(String endDate){
        System.out.println(name + " ends job in " + Integer.parseInt(endDate.substring(6)));
    }
}
