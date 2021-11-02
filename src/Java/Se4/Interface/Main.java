package Java.Se4.Interface;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        BatMan batMan = new BatMan();

        Hero h = batMan;
        CanFly canFly = batMan;
        CanFight canFight = batMan;

        h.canRun();
        h.fight();
        h.fly();

        canFly.fly();

        canFight.fight();
    }
}
