import Animal.Animal;
import bird.Flyable;
import bird.chicken.Chicken;
import bird.duck.Duck;
import cat.Cat;
import dog.Dog;
import bird.parrot.Parrot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String [] args){

        Cat cat = new Cat(4);
        Cat cat2 = new Cat(4);

        Dog dog = new Dog(4);
        Dog dog2 = new Dog(4);

        Parrot parrot = new Parrot(2, 2);
        Parrot parrot2 = new Parrot(2,2);

        Chicken chicken = new Chicken(2,2);

        Duck duck = new Duck(2,2);

        List<Cat> cats = new ArrayList<Cat>();

        cats.add(cat);
        cats.add(cat2);

        for(Cat forCat:cats){
            forCat.meow();
        }

        List<Dog> dogs = new ArrayList<Dog>();

        dogs.add(dog);
        dogs.add(dog2);


        for(Dog doggy:dogs){
            doggy.bark();
        }

        for(Dog doggy:dogs){
            doggy.sleep();
        }

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(dog);
        animals.add(cat);
        animals.add(parrot);

        for (Animal animal:animals){
            animal.poo();
        }

        List<Flyable> flyables = new ArrayList<Flyable>();
        flyables.add(parrot);
        flyables.add(parrot2);
        flyables.add(duck);

        for (Flyable flyable : flyables){
            flyable.fly();
        }
c
        List<Chicken> chickens = new ArrayList<Chicken>();

        chickens.add(chicken);

        for (Chicken chickeny : chickens){
            chicken.eat();

        }

        for (Chicken chickeny : chickens){
            chicken.walk();

        }



    }
}
