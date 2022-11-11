public class Dog extends Animal{
    public Dog(){
        count_dog++;
    }
    private static int count_dog;

    public static int getCount_dog() {
        return count_dog;
    }

    @Override
    public void run(int a) {

        if (a<501) {
            System.out.printf("Собака пробежала %s м. \n",a);
        } else {
            System.out.println("Собака пробежала 500 м. и устала");
        }
    }

    @Override
    public void swim(int a) {

        if (a<11) {
            System.out.printf("Собака проплыла %s м. \n",a);
        } else {
            System.out.println("Собакак отказалась плыть так много");
        }

    }
}
