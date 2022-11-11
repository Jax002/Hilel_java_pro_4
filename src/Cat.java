public class Cat extends Animal{
    public Cat(String name){
        super(name);
        count_cat++;
        this.name=name;
    }
    private static int count_cat;
    private String name;
    public static int getCount_cat() {
        return count_cat;
    }


    @Override
    public void run(int a) {
        if (a<201) {

            System.out.printf("%s пробежала %s м. \n",name,a);
        } else {
            System.out.printf("%s пробежала 200 м. и устала\n",name);
        }
    }

    @Override
    public void swim(int a) {
        System.out.printf("%s отказывается плавать\n",name);
    }
}
