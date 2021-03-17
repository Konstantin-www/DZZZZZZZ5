package DDDZZZ;

public class Animal {
    protected String run;
    protected String drift;
    protected String type;


    public Animal(String run, String drift){
        this.run = run;
        this.drift = drift;
    }

    public Animal() {

    }

    public void run(){
        System.out.println("Животное пробежало: ");
    }

    public  void drift(){
        System.out.println("Животное проплыло: ");
    }

}
