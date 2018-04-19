public class Bee extends Animal {


    public Bee(String name) {
        super(name,"pollen");
        this.name=name;
    }

    public  void sleep(){
        System.out.println(name+" never sleeps");
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