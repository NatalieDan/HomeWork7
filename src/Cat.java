public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    int getAppetite(){
        return appetite;
    }

    boolean getFullness(){
        return fullness;
    }

    void eat(Plate plate){
        if (appetite <= plate.getFood() && fullness == false){
            plate.decreaseFood(appetite);
            fullness = true;
        }
    }

    public String toString(){
        return "Cat " + name + " eat: " + appetite +". Status of fullness: " + fullness;
    }
}
