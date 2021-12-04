package cat;

import Animal.Animal;

public class Cat extends Animal {

    public Cat(int paws){
        super(paws);
    }

    public void meow(){
        System.out.println("meow!");
    }
}
