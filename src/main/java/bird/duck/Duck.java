package bird.duck;

import bird.Bird;
import bird.Flyable;

public class Duck extends Bird implements Flyable {

    public Duck (int paws, int wings){
        super(paws, wings);
    }
    public void fly(){
        System.out.println("Fru, fru, fru");
    }

}
