import java.util.ArrayList;


public class zoo {
    static String favoritefood="bacon";

    public static void main(String[] args){
        zoo z= new zoo();
        z.sleep("Jake");
        z.eat("jake","bacon");
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        Bear Koko=new Bear("Koko");
        Koko.eat("fish");
        Koko.eat("peanuts");
        Bee stinger=new Bee("stinger");
        stinger.eat("pollen");
        stinger.eat("peanuts");
        Unicorn rarity=new Unicorn("rarity");
        rarity.eat("marshmallows");
        rarity.eat("peanuts");
        Giraffe gemma=new Giraffe("gemma");
        gemma.eat("leaves");
        gemma.eat("peanuts");
        Zookeeper Zoebot= new Zookeeper("Zoebot");


        ArrayList<Animal> Animals = new ArrayList<Animal>();


        Animals.add(tigger);
        Animals.add(Koko);
        Animals.add(rarity);
        Animals.add(gemma);
        Animals.add(stinger);
        Zoebot.feedanimals("pollen", Animals);
    }

    public static void sleep(String name){
        System.out.println(name+" sleeps for 8 hours");
    }
    public static void eat(String name, String food){
        System.out.println(name+" eats "+food);
        if(food.equals(favoritefood)){
            System.out.println("YUM!!! "+name+ " wants more "+food);
        }
    }



}
