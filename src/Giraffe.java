public class Giraffe extends Animal {


    public Giraffe(String name) {
        super(name,"leaves");
        this.name=name;
    }

    public  void eat( String food){
        System.out.println(name+" eats "+food);
        if(food.equals(favoritefood)){
            System.out.println("YUM!!! "+name+ " wants more "+food);
            sleep();
        }else{
            System.out.println("YUCK!!! "+name+ " will not eat "+food);

        }
    }

}