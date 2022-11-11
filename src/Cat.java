public class Cat extends Animal{
    public Cat(){
        count_cat++;
    }
    private static int count_cat;

    public static int getCount_cat() {
        return count_cat;
    }

    @Override
    public void run(int a) {
        if (a<201) {
            System.out.printf("Кошка пробежала %s м. \n",a);
        } else {
            System.out.println("Кошка пробежала 200 м. и устала");
        }
    }

    @Override
    public void swim(int a) {
        System.out.println("Кошка отказывается плавать");
    }
}
