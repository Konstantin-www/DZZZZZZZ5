package DDDZZZ;

public class Cat extends Animal{

    String name;

    public Cat(String run, String drift){
        super(run, drift);
        this.type="Cat";
    }

    public Cat() {
        super();
    }

    @Override
    public void run() {
        System.out.printf("Cat:  200m\n", this.name);

    }

    @Override
    public void drift() {
        System.out.printf("Cat:  не умеет плавать\n", this.name);

    }
}
