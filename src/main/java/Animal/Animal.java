package Animal;

public abstract class Animal {

    private int paws;

    public Animal (int paws){
        this.paws = paws;
    }

    public void sleep(){
        System.out.println("zzzZZZZZzzz");
    }

    public void eat(){
        System.out.println("Omnomnom");
    }

    public void poo(){
        System.out.println("shit!");
    }
    public void walk(){
        System.out.println("Dum, dum");
    }



}
