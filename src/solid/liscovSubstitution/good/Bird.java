package solid.liscovSubstitution.good;

public class Bird implements Breathing,Consuming, Run {

    private String name;
    private String group;

    public Bird(String name, String group) {
        this.name = name;
        this.group = group;
    }


    @Override
    public void breath(){
        System.out.println(this.name+" is breathing");
    }

    @Override
    public void consumeFood(){
        System.out.println(this.name+": umm this is tasty");
    }

    @Override
    public void run() {
        System.out.println(this.name+" can fly");
    }
}
