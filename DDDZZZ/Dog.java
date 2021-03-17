package DDDZZZ;

public class Dog extends Animal{

    String name;

    public Dog(String run, String drift){
        super(run, drift);
        this.type="Dog";
    }

    public Dog() {
        super();
    }

    @Override
    public void run() {
        System.out.printf("Dog:  500m\n", this.name);

    }

    @Override
    public void drift() {
        System.out.printf("Dog:  10m\n", this.name);

    }
}
