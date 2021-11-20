package solid.liscovSubstitution.good;

public class Snail implements Breathing,Consuming{

    private String name;
    private String group;

    public Snail(String name, String group) {
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

}
