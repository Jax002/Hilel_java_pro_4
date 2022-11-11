import java.util.ArrayList;

public class Check {

    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<>();
        animal.add(new Dog("Бобик"));
        animal.add(new Cat("Вася"));
        animal.add(new Dog("Барсик"));
        animal.add(new Cat("Мурка"));
        animal.add(new Dog("Барон"));
        for (Animal a : animal ) {
            a.run(1);
            a.swim(11);
        }
        System.out.printf("У нас %s жиыотных. Собак: %s, кошек %s",Animal.getCount_animal(),Dog.getCount_dog(),Cat.getCount_cat());



    }
        }
