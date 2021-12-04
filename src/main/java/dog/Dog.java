package dog;

import Animal.Animal;

public class Dog extends Animal {

    public Dog(int paws){
        super(paws);
    }

    public void bark(){
        System.out.println("Hau! Hau!");
    }

    @Override
    public void poo(){
        System.out.println("Tum");
    }
}
