public class Bear extends Animal {


    public Bear(String name) {
        super(name,"fish");
        this.name=name;
    }

    public  void sleep(){
        System.out.println(name+" hibernates for 4 months");
    }

}