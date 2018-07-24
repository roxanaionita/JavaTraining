package training;

import training.prob1.*;
import training.prob2.*;
import training.prob3.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("test for commit");
    }


    // PROB 1

    /*private static void TestProb1() {
        InputOutput io = new InputOutput();

        try {
            io.Read();
            io.Write("prob2.InputOutput.Write functioneaza");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    // =========================================================

    // PROB2

    /*private static void TestProb2() {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        Animal animal = new Animal("AnimalFaraNume", 15);
        Cat cat = new Cat("Lalea", 3);
        Dog dog = new Dog("Bobita", 4);
        animals.add(animal);
        animals.add(cat);
        animals.add(dog);

        for (Animal a : animals) {
            System.out.println(a.name + " (" + a.age + " ani) :");
            a.makeSound();
        }
    }*/

    // ===========================================================

    // PROB3

    /*private static void TestProb3() {
        RockPaperScissors rps = new RockPaperScissors();
        rps.runGame();
    }*/
}
