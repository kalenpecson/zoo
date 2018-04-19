import java.util.ArrayList;

public class Zookeeper {
    String name;

    public Zookeeper(String name){
        this.name=name;

    }

    public void feedanimals(String food, ArrayList<Animal> Animals ){
        System.out.println(name +" is feeding "+food+" to "+Animals.size()+" of "+Animal.population+" animals");
        for (int i=0; i<Animals.size();i++){
            Animals.get(i).eat(food);
        }
    }
}
