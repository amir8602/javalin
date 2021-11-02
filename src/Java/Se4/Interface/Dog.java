package Java.Se4.Interface;

public class Dog extends Animal{

    private static Integer max_age;
    static {
        max_age = 10;
    }

    @Override
    public void voice() {
        System.out.println("hop");
    }
}
