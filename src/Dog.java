public class Dog extends Animal{


    public Dog(String name){
        super(name);
        count_dog++;
        this.name=name;
    }
    private static int count_dog;
    private String name;
    public static int getCount_dog() {
        return count_dog;
    }

    @Override
    public void run(int a) {

        if (a<501) {
            System.out.printf("%s пробежал %s м. \n",name,a);
        } else {
            System.out.printf("%s пробежал 500 м. и устала \n",name);
        }
    }

    @Override
    public void swim(int a) {

        if (a<11) {
            System.out.printf("%s проплыл %s м. \n",name,a);
        } else {
            System.out.printf("%s отказался плыть так много \n",name);
        }

    }
}
