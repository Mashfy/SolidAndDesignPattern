package solid.liscovSubstitution.bad;

public class Animal {
    private String name;
    private String group;

    public Animal(String name, String group) {
        this.name = name;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public void breath(){
        System.out.println(this.name+" is breathing");
    }

     public void consumeFood(){
         System.out.println(this.name+": umm this is tasty");
     }

     public void run(){
         System.out.println("I am speed");
     }


}
