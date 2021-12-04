package bird.parrot;

import Animal.Animal;
import bird.Bird;
import bird.Flyable;

public class Parrot extends Bird implements Flyable {

    public Parrot (int paw, int wings){
        super(paw, wings);
    }

    public void talk (String something) {
        System.out.println(something);

    }

    public void fly(){
        System.out.println("Fruuuuuu!");
    }
    @Override
    public void poo(){
        System.out.println("Plask");
    }
}
