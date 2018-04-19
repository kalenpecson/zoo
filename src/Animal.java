public class Animal {
    String name;
    String favoritefood;
    static int population=0;

    public Animal(String name, String favoritefood) {
        this.name=name;
        this.favoritefood=favoritefood;
        population++;
    }

    public  void sleep(){
        System.out.println(name+" sleeps for 8 hours");
    }

    public  void eat( String food){
        System.out.println(name+" eats "+food);
        if(food.equals(favoritefood)){
            System.out.println("YUM!!! "+name+ " wants more "+food);
        }else{
            sleep();
        }
    }

    public int populationCount(){
        return population;
    }


}