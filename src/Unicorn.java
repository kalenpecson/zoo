public class Unicorn extends Animal{


    public Unicorn(String name) {
        super(name,"marshamallows");
        this.name=name;
    }

    public  void sleep(){
        System.out.println(name+" sleeps in a cloud");
    }


}