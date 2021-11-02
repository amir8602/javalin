package Java.Se4.Interface;

public class BatMan extends Bat implements Hero{

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void canRun() {
        System.out.println("run");
    }

    @Override
    public void fight() {
        System.out.println("fight");
    }
}
