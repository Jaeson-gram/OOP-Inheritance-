package com.OJ;
import com.Challenge.Employee;
import com.Challenge.HourlyEmployee;
import com.Challenge.SalariedEmployee;
import com.Relearn.Animal;
import com.Relearn.Dog;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal someAnimal = new Animal("Random Animal", "large", 79);
        doSomeAnimalStuff(someAnimal, "Medium");

        //instantiated with the default const
        Dog Morphy = new Dog();
        doSomeAnimalStuff(Morphy, "fast");

        //using the constructor that lets us define everything
        Dog Carie = new Dog("Neapolitan Mastiff", 33, "Perky", "Swimmer");
        doSomeAnimalStuff(Carie, "fast");

        //using the constructor that was made for dogs with 'Perky' ear shapes and 'Swimmer' tail shapes
        Dog yorkie = new Dog("Yorkie", 15);
        doSomeAnimalStuff(yorkie, "fast");

        //using the constructor that lets us define everything
        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doSomeAnimalStuff(retriever, "slow");

        System.out.println();










        //FOR THE CHALLENGE...

        Employee Sam = new Employee("Samuel", "09/08/1969", "01/06/2024");
        System.out.println(Sam);
        Sam.getAge();

        System.out.println();

        SalariedEmployee Jamie = new SalariedEmployee("Jamie Singer", "13/09/2000", "23/09/2024", 120_000);
        System.out.println(Jamie);
        System.out.println("Jamie is " + Jamie.getAge());
        System.out.println("Jamie's paycheck is $" + Jamie.collectPay());
        Jamie.retire();
        System.out.println("Jamie's pension check is $" + Jamie.collectPay());


        System.out.println();

        HourlyEmployee Fer = new HourlyEmployee("Feranmi", "01/05/2002", "19/12/2024", 23);
        System.out.println(Fer);
        System.out.println("Fer's weekly paycheck is $" + Fer.collectPay());
        Fer.getDoublePay();
//        Fer.terminate("01/12/2025");
    }

    public static void doSomeAnimalStuff(Animal animal, String speed){
        //if dog is the animal, it uses the makeNoise() and move() methods in the Dog class, otherwise it uses the super class's makeNoise() and move() methods
        animal.makeNoise();
        animal.move(speed);
        //Printing the animal as the first statement prints out the package name as well. Why is that?
        // ---> com.Relearn.Animal { ...      ..Oh. I figured out it was because the toString(); had defined it that way. Something to do with JDK 17 I guess
        System.out.println(animal); //...whatever the animal is.

        System.out.println("_ _ _ _ ");
    }
}
