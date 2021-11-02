package Java.Se4.Interface;

public class CustomDog implements IAnimal{

    @Override
    public void move() {
        System.out.println("move");
    }

    @Override
    public void voice() {
        System.out.println("voice");
    }
}
