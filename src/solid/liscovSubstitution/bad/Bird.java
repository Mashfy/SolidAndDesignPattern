package solid.liscovSubstitution.bad;

public class Bird extends Animal{

    public Bird(String name, String group) {
        super(name, group);
    }

    @Override
    public void run(){
        System.out.println(this.getName()+" can fly");
    }
}
