public abstract class Animal {
    public static int getCount_animal() {
        return count_animal;
    }

    public Animal(String name){
        count_animal++;
    }
    private static int count_animal;
    public abstract void run(int a);
    public abstract void swim(int a);
}
