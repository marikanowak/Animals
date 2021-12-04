package bird;

import Animal.Animal;

public class Bird  extends Animal {
    private int wings;

    public Bird (int paws, int wings){
        super(paws);
        this.wings = wings;
    }

}
