import java.util.ArrayList;

public class Check {

    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<>();
        animal.add(new Dog());
        animal.add(new Cat());
        animal.add(new Dog());
        animal.add(new Cat());
        animal.add(new Dog());
        for (Animal a : animal ) {
            a.run(1600);
            a.swim(10);
        }
        System.out.printf("У нас %s жиыотных. Из них %s собак и %s кошек",Animal.getCount_animal(),Dog.getCount_dog(),Cat.getCount_cat());



    }
        }
