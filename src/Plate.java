public class Plate {
    private int food;

    Plate(int food){
        this.food = food;
    }

    int getFood(){
        return food;
    }

    void addFood(int food){
        this.food += food;
    }

    void decreaseFood(int food){
        this.food -= food;
    }

    public String toString(){
        return "Food in plate: " + food;
    }
}
