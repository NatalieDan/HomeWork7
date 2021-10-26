public class HomeWork7 {
    public static void main(String[] args){
        Cat[] cat = new Cat [3];
        cat[0] = new Cat("Barsik", 5);
        cat[1] = new Cat("Murzik", 6);
        cat[2] = new Cat("Vasiliy", 3);

        Plate plate = new Plate(10);
        System.out.println(plate);

        for (int i = 0; i < cat.length; i++){
            System.out.println();
            System.out.println(cat[i]);
            cat[i].eat(plate);
            System.out.println("After dinner:");
            System.out.println(cat[i]);
        }

        System.out.println();
        System.out.println(plate);

        plate.addFood(10);
        System.out.println(plate);

        for (int i = 0; i < cat.length; i++){
            if (cat[i].getFullness() == false) {
                System.out.println();
                System.out.println(cat[i]);
                cat[i].eat(plate);
                System.out.println("After dinner:");
                System.out.println(cat[i]);
            }
        }

        System.out.println();
        System.out.println(plate);
    }
}
