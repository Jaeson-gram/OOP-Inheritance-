package com.Relearn;

public class Dog extends Animal{

    //Dog only field variables
    private String earShape;
    private String tailShape;

    //this is the default constructor
    public Dog(){
        super("Mutt", "Big", 50);
    }

    //this constructor will be used for all dogs with perky ear shapes and curly tail shapes
    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curly");
    }

    //this constructor will be used when every var has to be defined. We automatically get the size(s,m,l)
    // of the dog by doing some calculations on the weight, inside the constructor
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, ((weight < 15) ? "small" : (weight > 15 && weight < 30) ? "medium" : "large") , weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    //Polymorphism --> Run-time polymorphism - Method Override: Overriding a parent's class's method.
    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    //The override keyword is not necessary. To override a method, you just have to create the same method
    // with the exact signatures (parameter number and types)
    public void makeNoise(){
        System.out.println("Dog barks");
    }

    @Override
    public void move(String speed) {
//        super.move(speed);
        System.out.println("Dog walks, runs, and waves tail");
    }

    //Dog only method
    public void breed(){
        System.out.println("Dog breeds ");
    }
}
