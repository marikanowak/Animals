package bird.chicken;

import bird.Bird;

public class Chicken extends Bird {

    public Chicken (int paws, int wings){
        super(paws, wings);
    }


    public void poo() {
        super.poo();
    }
    @Override
    public void walk(){
        System.out.println("Tup, tup");
    }

    @Override
    public void eat() {
        System.out.println("dziub, dziub");
    }
}
