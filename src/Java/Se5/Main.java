package Java.Se5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("javad","akbari",23);
        Person p2 = new Person("reza","mahmoodi",24);
        Person p3 = new Person("sara","kamali",19);

        Person [] people = new Person[3];
        people [0] = p1;
        people [1] = p2;
        people [2] = p3;

        Arrays.sort(people);


        for (Person person : people) {
            System.out.println(person);
        }

    }
}
